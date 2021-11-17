USE clinica2236347;

# 1. Seleccione los códigos que no tienen movimientos en la tabla de detalles de facturación.
SELECT * FROM contratos WHERE codigo NOT IN (SELECT contrato FROM detallesfac);

/* 2. Seleccione los pacientes a los cuales se les ha facturado servicios en la unidad funcional
de consulta externa o de laboratorio clínico. */
SELECT * FROM pacientes WHERE numero IN (
	SELECT identifica FROM detallesfac
    WHERE unidadf IN (
		SELECT codigo FROM unidadesf 
        WHERE nombre LIKE 'CONSULTA%' 
        OR nombre LIKE "LABORATORIO%"
	)
);

/*3. Seleccione los valores totales por contrato de los movimientos facturados de los
servicios que estén activos, de pacientes de género femenino del área urbana. */
SELECT c.nombre, d.vtotal FROM detallesfac d, contratos c WHERE c.codigo IN (
	SELECT s.codigo FROM servicios s WHERE s.estado = 'A'
) AND d.identifica IN (
	SELECT p.numero FROM pacientes p
    WHERE p.sexo = 'F' AND p.zona = 'U'
) AND c.codigo = d.contrato;

