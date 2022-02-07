/* FUNCIONES NATIVAS SQL PARTE 2 Y clausulas SQL*/

/*funciones UPPER, LOWER */
/* estas funciones nos permiten trabajar las cadenas de caracteres
en mayusculas o minusculas*/
select * from pacientes where 
nombre3='DIEGO';

update pacientes set nombre3=nombre1;

SELECT * from pacientes where 
nombre3 like '%diego%';
/*deseo llevar el estandar en MAYUSCULAS*/
SELECT * from pacientes where 
UPPER(nombre3) like '%DIEGO%';
/*deseo llevar el estandar en MINUSCULAS*/
SELECT * from pacientes where 
LOWER(nombre3) like '%diego%';

/*limitar la cantidad de registros de una consulta*/
/*LIMIT LIMITA LA CANTIDAD DE FILAS
OFFSET IGNORA LOS REGISTROS QUE HAY ANTES DEL PARAMETRO
NUMERICO QUE RECIBE*/
select * from pacientes 
where rh='O+'
LIMIT 10 OFFSET 20;

/*ordenamiento de registros - ORDER BY*/
SELECT * from unidadesf
order by nombre;

select * from pacientes
where rh in('O+','A+','B+')
order by apellido1,apellido2,nombre1,nombre2

select * from pacientes
order by sexo asc;
/* tipos de ordenamiento
Ascendente - por defecto. se puede hacer explicito
con la clausua asc, pero no es necesaria

Descendente - hay que especificarlo con la
clausula desc. y debe hacerse por cada campo
que requiera ese tipo de ordenamiento*/
select * from pacientes
order by sexo desc;

select * from pacientes
order by apellido1,apellido2,nombre1,nombre2

select apellido1,apellido2,nombre1,nombre2,
direccion,rh from pacientes
order by 1,2,3,4

/*OBSERVACIÓN. la clausula order by
hace que las consultas sean mas pesadas
y se ejecutan más lento*/

/*clausula DISTINCT permite seleccionar los
diferentes registros de una tabla, según la lista
de campos especificada en la consulta*/
select distinct tipodoc from detallesfac

select distinct tipodoc from pacientes

select distinct contrato from detallesfac

select * from pacientes
order by apellido1,apellido2,nombre1,nombre2

2605 registros

select distinct apellido1,apellido2,nombre1,nombre2 
from pacientes
order by apellido1,apellido2,nombre1,nombre2

select apellido1,apellido2,nombre1,nombre2, count(*) 
from pacientes
group by apellido1,apellido2,nombre1,nombre2
order by 5 desc

CARDONA	OSPINA	SALOME	
PEDRAZA	VARGAS	GIOVANNY	ANDRES

select distinct depto,mpio from pacientes