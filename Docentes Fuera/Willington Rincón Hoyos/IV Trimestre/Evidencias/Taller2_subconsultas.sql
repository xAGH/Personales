USE clinica2236347;

SELECT 
    *
FROM
    contratos
WHERE
    codigo NOT IN (SELECT 
            contrato
        FROM
            detallesfac);

/* 2. Seleccione los pacientes a los cuales se les ha facturado servicios en la unidad funcional
de consulta externa o de laboratorio clínico. */
SELECT *
FROM pacientes
WHERE numero IN (
	SELECT identifica
	FROM detallesfac
    WHERE unidadf IN (
		SELECT codigo 
        FROM unidadesf 
        WHERE nombre LIKE 'CONSULTA%' 
        OR nombre LIKE 'LABORATORIO%'
	)
);

/* 3. Seleccione los valores totales por contrato de los movimientos facturados de los
servicios que estén activos, de pacientes de género femenino del área urbana. */
SELECT 
    c.nombre, SUM(d.vtotal)
FROM
    detallesfac d
        INNER JOIN
    contratos c ON c.codigo = d.contrato
WHERE
    d.codigo IN (SELECT 
            s.codigo
        FROM
            servicios s
        WHERE
            s.estado = 'A')
        AND d.identifica IN (SELECT 
            p.numero
        FROM
            pacientes p
        WHERE
            p.sexo = 'F' AND p.zona = 'U')
GROUP BY c.nombre;

/* 4.  Muestre cuales son los 10 primeros servicios cuyo valor facturado ha sido el más alto. 
No incluya servicios de las unidades funcionales de Odontología ni de Laboratorio 
Clínico. */
SELECT 
    s.nombre, s.codigo, SUM(d.vtotal) AS mayor_valor_facturado
FROM
    servicios s
        INNER JOIN
    detallesfac d ON d.codigo = s.codigo
WHERE
    d.unidadf IN (SELECT 
            codigo
        FROM
            unidadesf uf
        WHERE
            uf.nombre NOT LIKE 'ODONTOLOGIA'
                AND uf.nombre NOT LIKE 'LABORATORIO')
GROUP BY s.nombre
ORDER BY 3 DESC
LIMIT 10;

/**/
