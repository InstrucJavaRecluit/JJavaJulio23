create table Pacientes(
Paciente_ID int PRIMARY key,
Nombre NVARCHAR2(15),
ApellidoP NVARCHAR2(15),
ApellidoM NVARCHAR2(15),
Curp NVARCHAR2(20),
Fecha_Naci Date,
NSS NVARCHAR2(10),
Sexo NVARCHAR2(1),
Tipo_Sangre NVARCHAR2(3)
);
insert into Pacientes Values (1,'Victor', 'Cuevas', 'Contreras', 'CUSKRP024JS', '14-10-1998', 'JPS76', 'H', '0+');
insert into Pacientes Values (2,'Jahir', 'Perez', 'Cruz', 'CUSKRP024JS', '14-10-1998', 'JPS76', 'H', '0+');
insert into Pacientes Values (3,'Daniel', 'Gonzales', 'Torres', 'CUSKRP024JS', '14-10-1998', 'JPS76', 'H', '0+');
select*from Pacientes;

create table Medicamentos(
Medicamento_ID int PRIMARY key,
Nombre NVARCHAR2(20),
Patente CHAR(1),
Fecha_Cad Date,
Ingrediente_Act NVARCHAR2(25),
Marca NVARCHAR2(15)
);
insert into Medicamentos Values (1,'Paracetamol', 'G', '18-12-1999', 'LSD', 'TRAX');
insert into Medicamentos Values (2,'Ibuprofeno', 'G', '14-10-1998', 'COCA', 'SIMI');
insert into Medicamentos Values (3,'Ketorolaco', 'P', '14-10-1998', 'CANAVIS', 'OLX');
select*from Medicamentos;

create table Doctores(
Doctor_ID int PRIMARY key,
Nombre NVARCHAR2(20),
Especialidad NVARCHAR2(15),
Cedula NVARCHAR2(15),
Fecha_Naci Date,
Sexo NVARCHAR2(1)
);
insert into Doctores Values (1,'Victor Cuevas C', 'Gediatria', 'Kt-573s', '18-12-1999', 'H');
insert into Doctores Values (2,'Jahir Perez Cruz', 'Pediatra', 'JPS76', '14-10-1998', 'H');
insert into Doctores Values (3,'Daniel Gonzales T', 'General', 'JPS76', '14-10-1998', 'H');
select*from Doctores;

create table Personal(
Persona_ID int PRIMARY key,
Nombre NVARCHAR2(15),
Departamento_Id int, ---Foranea
Fecha_Naci Date,
Cargo NVARCHAR2(30),
foreign key (Departamento_Id) references Departamentos(Departamento_ID)
);
insert into Personal Values (1,'Victor Cuevas C', 1, '18-12-1999', 'Jefe');
insert into Personal Values (2,'Jahir Perez C', 2, '14-10-1998', 'Supervi');
insert into Personal Values (3,'Daniel G. T', 3, '14-10-1998', 'SubJefe');
select*from Personal;
-------------------------------------------------
create table Departamentos(
Departamento_ID int PRIMARY key,
Doctor_ID int,
Descripcion NVARCHAR2(30),
N_Personal int,
foreign key (Doctor_ID) references Doctores(Doctor_ID)
);
insert into Departamentos Values (1,2, 'Gediatria', 12);
insert into Departamentos Values (2,1, 'Pediatra', 4);
insert into Departamentos Values (3,3, 'General', 6);
select*from Departamentos;


create table Citas_Programadas(
Cita_ID int PRIMARY key,
Paciente_ID int,
Departamento_ID int,
Fecha_Cita Date,
Estatus CHAR(1),
Peso int,
Estatura int,
foreign key (Paciente_ID) references Pacientes(Paciente_ID),
foreign key (Departamento_ID) references Departamentos(Departamento_ID)
);

insert into Citas_Programadas Values (1,3, 3, '18-12-1999', 'A', 120, 186);
insert into Citas_Programadas Values (2,1, 2, '14-10-1998', 'A', 90, 160);
insert into Citas_Programadas Values (3,2, 1, '14-10-1998', 'C', 70, 170);
select*from Citas_Programadas;

create table Diagnostico(
Diagnostico_ID int PRIMARY key,
Doctor_ID int,
Paciente_ID int,
Fecha Date,
Detalle NVARCHAR2(100),
foreign key (Paciente_ID) references Pacientes(Paciente_ID),
foreign key (Doctor_ID) references Doctores(Doctor_ID)
);

insert into Diagnostico Values (1,3, 3, '18-12-1999', 'Vomito');
insert into Diagnostico Values (2,1, 2, '14-10-1998', 'Embarazo');
insert into Diagnostico Values (3,2, 1, '14-10-1998', 'Operacion del riñon');
select*from Diagnostico;

create table Receta(
Receta_ID int PRIMARY key,
Diagnostico_ID int,
Status NVARCHAR2(10),
foreign key (Diagnostico_ID) references Diagnostico(Diagnostico_ID)
);
insert into Receta Values (1,3, 'Alta');
insert into Receta Values (2,1, 'Observa');
insert into Receta Values (3,2, 'Observa');
select*from Receta;

create table Detalles_receta(
Det_Rec_ID int PRIMARY key,
Receta_ID int,
Medicamento_ID int,
Dosis NVARCHAR2(50),
foreign key (Receta_ID) references Receta(Receta_ID),
foreign key (Medicamento_ID) references Medicamentos(Medicamento_ID)
);
insert into Detalles_receta Values (1,3,2, '2 cad 8 horas');
insert into Detalles_receta Values (2,1,3, '1 al dia');
insert into Detalles_receta Values (3,2,1, '1/2 cada 12 horas');
select*from Detalles_receta;