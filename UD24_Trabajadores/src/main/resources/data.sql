
DROP table IF EXISTS trabajador;

create table trabajador(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	puesto varchar(250),
	salario integer 
);

insert into trabajador (nombre, apellido, puesto, salario) values ('Jose','Marin','Comercial',1250);
insert into trabajador (nombre, apellido, puesto, salario) values ('Juan','Lopez','Electricista',1100);
insert into trabajador (nombre, apellido, puesto, salario) values ('Pedro','Guillem','Programador',1300);
insert into trabajador (nombre, apellido, puesto, salario) values ('Jordi','Martin','Analista',1350);
insert into trabajador (nombre, apellido, puesto, salario) values ('Jonatan','Vicente','Recursos Humanos',1200);