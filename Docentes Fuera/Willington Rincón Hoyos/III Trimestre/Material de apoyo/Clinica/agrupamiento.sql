SELECT d.contrato, c.nombre, SUM(d.vtotal) as valor_total
FROM detallesfac d, contratos c
WHERE d.contrato = c.codigo
GROUP BY contrato
ORDER BY 3 DESC;