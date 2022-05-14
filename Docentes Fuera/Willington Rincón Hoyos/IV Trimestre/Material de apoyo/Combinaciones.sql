USE citas_2236347;

/* Inserción de datos*/
INSERT INTO manuales
VALUES('C1', 'Manual tarifario 2021', 3500.00, 2021);

INSERT INTO eps
VALUES('EPS001', 'Sánitas', 'Cra. 13 #117 #1a, Armenia - Quindío', '7466310', '7466310', 'Privada', 'C1');

INSERT INTO pacientes
VALUES('1004916686', 'CC', 'Giraldo', 'Herrera', 'Alejandro', '', 'Barrio La Cecilia', '3013258495',
	   'EPS001', 'M', '');
       
INSERT INTO pacientes
VALUES('4378072', 'CC', 'Giraldo', 'Tobón', 'Jhon', 'Eider', 'Barrio La Cecilia', '3017136116',
	   'EPS001', 'M', '');

/* Realizar una consulta que muestre los nombres y apellidos de los pacientes, el teléfono y el nombre de la EPS*/
SELECT CONCAT(p.pnombre, " ", p.snombre) AS nombres, CONCAT(p.papellido, " ", p.sapellido) AS apellidos,
		e.telefono AS telefono_eps, e.nombre AS nombre_eps
FROM pacientes p, eps e
WHERE e.codigo = p.eps;

/* Inserción con valores null*/
INSERT INTO pacientes
VALUES('1004870802', 'CC', 'Giraldo', 'Bañol', 'Michael', '', 'Barrio La Cecilia', '3012672710',
	   null, 'M', '');
       
Select * from Pacientes;

INSERT INTO pacientes
VALUES('10045875', 'CC', 'dominguez', 'dominguez', 'guillermo', '', 'Barrio La zuldemaidda', '3145748691',
	   null, 'M', '');


/*conbinacion   left jhoin  combinacion  ala  izquierda   aqui se leda prioridad ala  tabla   izquierdad  de  la conbinnacion   
cuando      el   valo  de   la  lleve   principal  coincida  con la  llave   foranea   llos     datos  selecionados  de  la  tablas  realcionados    se presentan   sde forma COMPLETA.  si la llave foranea tinee   un valor nulo     los  datos   
de la tabla   no priorizada  se presentan  valores  nulos  */

select  p.papellido,p.sapellido,p.pnombre,p.snombre,
p.telefono, e.nombre,e.direccion, e.telefono from
 pacientes   p left join   eps e
on e.codigo= p.eps;


INSERT INTO eps
VALUES('EPS002', 's.o.s', 'Cra. 20 #85 , Armenia - Quindío', '75068953', '7845897', 'Privada', 'C1');


/*mostrar  todos    los   pacientees   (nombre,  applleido,   direccion  ... )  mostrar el   nombre  de  la   eps   */


select  p.papellido,p.sapellido,p.pnombre,p.snombre,
p.telefono, e.nombre,e.direccion, e.telefono,m.nombre as  nommanual from
 pacientes   p left join   eps e
on e.codigo= p.eps
left join manuales m  on  m.codigo=e.manual;


/*combinacion   ala     derecha   */ 
select  p.papellido,p.sapellido,p.pnombre,p.snombre,
p.telefono, e.nombre,e.direccion, e.telefono from
 eps e right join   pacientes   p
on e.codigo= p.eps;


/*mostrar  todos   los   pacientes  ,   mostrar el  nombre   de la  eps    direciion  de la eps    y el  numbre del  manuaul  */

select  p.papellido,p.sapellido,p.pnombre,p.snombre,
p.telefono, e.nombre,e.direccion, e.telefono,m.nombre as  nommanual from
 manuales m right join   eps e  on  m.codigo=e.manual 
right join pacientes p on    e.codigo=p.eps;


select  * from   especialidades;

insert into especialidades (codigo,nombre,nivel)
values  ('E03','MEDICINA GENERAL', 4);

INSERT INTO MEDICOS(documento,regmedico,nombres,apellidos , direccion, telefono,especialidad, firma)
values ('10968567','12345','CARLOS','SUAREZ','','31245677','e04','CARLOS.JPG'),
('10589754','1004','guillermmo','dominguez','','74355689','e03','imagen.JPG');

select * from  medicos;

select m.documento,  m.nombres, m.apellidos, e.nombre
from medicos m left join especialidades e
on m.idmedico = e.codigo;
 
 /*12*/
 
 insert into servicios(codigo,nombre,estado)
 values ('890201','CONSULTA MEDICA GENERAL','1');
select * from  servicios;


 /*13*/
 select * from  usuarios;
 insert into usuarios( idusuario,nombre,direccion,telefono,email,password)
 values ('003','juan','mz 4 cas 6 la fachada','7489685','juan@sena.com', '');
 
 
  /*14*/
  select * from pacientes;
   select * from eps  ;
 select * from citas;
 insert into  citas( idcita,fecha,hora,medico,eps,paciente,servicio,estado,idusuario)
 values ('012',null,'2pm','4','eps002','10045875','890201','1','003')
  



