CREATE TABLE PERSONAL(
PERSONAL_ID NUMBER (11) PRIMARY KEY,
DEPARTAMENTO_ID NUMBER (11),
NOMBRE NVARCHAR2 (20),
FECHA_NAC DATE,
CARGO NVARCHAR2 (30)
);

CREATE TABLE DEPARTAMENTOS(
DEPARTAMENTO_ID NUMBER (11) PRIMARY KEY,
DOCTOR_ID NUMBER (11),
DESCRIPCCION NVARCHAR2 (30),
N_PERSONAL NUMBER (11)
);

CREATE TABLE CITAS_PROGRAMADAS(
CITA_ID NUMBER (11)PRIMARY KEY,
PACIENTE_ID NUMBER (11),
DEPARTAMENTO_ID NUMBER (11),
FECHA_CITA DATE,
STATUS CHAR(1),
PESO NUMBER (11),
ESTATURA NUMBER (11)
);

CREATE TABLE DOCTORES(
DOCTOR_ID NUMBER (11)PRIMARY KEY,
NOMBRE NVARCHAR2 (15),
ESPECIALIDAD NVARCHAR2 (15),
CEDULA NVARCHAR2 (15),
FECHA_NAC DATE,
SEXO NVARCHAR2(1)
);

CREATE TABLE DIAGNOSTICO(
DIAGNISTICO_ID NUMBER (11)PRIMARY KEY,
DOCTOR_ID NUMBER (11),
PACIENTE_ID NUMBER(11),
FECHA DATE,
DETALLE NVARCHAR2(100)
);

CREATE TABLE PACIENTES(
PACIENTES_ID NUMBER(11)PRIMARY KEY,
NOMBRE NVARCHAR2(15),
APELLIDO_P NVARCHAR2(15),
APELLIDO_M NVARCHAR2(15),
CURP NVARCHAR2(20),
FECHA_NAC DATE,
NSS NVARCHAR2(10),
SEXO NVARCHAR2(1),
TIPO_SANGRE NUMBER(3)
);

CREATE TABLE RECETA(
RECETA_ID NUMBER (11)PRIMARY KEY,
DIAGNOSTICO_ID NUMBER (11),
STATUS NUMBER(10)
);

CREATE TABLE DETALLES_RECETA(
DET_REC_ID NUMBER (11)PRIMARY KEY,
RECETA_ID NUMBER (11),
MEDICAMENTO_ID NUMBER (11),
DOSIS NVARCHAR2(50)
);

CREATE TABLE MEDICAMENTOS(
MEDICAMENTO_ID NUMBER (11)PRIMARY KEY,
NOMBRE NVARCHAR2(20),
PATENTE CHAR(1),
FECHA_CAD DATE,
INGREDIENTE_ACT NVARCHAR2(25),
MARCA NVARCHAR2(15)
);
----LLAVES FORANEAS
ALTER TABLE DEPARTAMENTOS ADD CONSTRAINT FK_DEPARTAMENTOS_DOCTOR_ID
FOREIGN KEY (DOCTOR_ID)
REFERENCES DOCTORES (DOCTOR_ID);

ALTER TABLE PERSONAL ADD CONSTRAINT FK_PERSONAL_DEPARTAMENTO_ID
FOREIGN KEY (DEPARTAMENTO_ID)
REFERENCES DEPARTAMENTOS (DEPARTAMENTO_ID);

ALTER TABLE DEPARTAMENTOS DROP CONSTRAINT FK_DEPARTAMENTOS_DOCTOR_ID;

ALTER TABLE CITAS_PROGRAMADAS ADD CONSTRAINT FK_CITAS_PACIENTE_ID
FOREIGN KEY (PACIENTE_ID)
REFERENCES PACIENTES (PACIENTE_ID);

ALTER TABLE DIAGNOSTICO ADD CONSTRAINT FK_DIAGNOSTICO_PACIENTE_ID
FOREIGN KEY (PACIENTE_ID)
REFERENCES PACIENTES (PACIENTE_ID);

ALTER TABLE DIAGNOSTICO ADD CONSTRAINT FK_DIAGNOSTICO_DOCTOR_ID
FOREIGN KEY (DOCTOR_ID)
REFERENCES DOCTORES (DOCTOR_ID);

ALTER TABLE RECETA ADD CONSTRAINT FK_RECETA_DIAGNOSTICO_ID
FOREIGN KEY (DIAGNOSTICO_ID)
REFERENCES DIAGNOSTICO (DIAGNOSTICO_ID);

ALTER TABLE DETALLES_RECETA ADD CONSTRAINT FK_DETALLES_RECETA_ID
FOREIGN KEY (RECETA_ID)
REFERENCES RECETA (RECETA_ID);

ALTER TABLE DETALLES_RECETA ADD CONSTRAINT FK_DETALLES_MEDICAMENTO_ID
FOREIGN KEY (MEDICAMENTO_ID)
REFERENCES MEDICAMENTOS (MEDICAMENTO_ID);
---SECUENCIA Y TRIGGER PERSONAL
CREATE SEQUENCE PERSONAL_SEQ START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER ON_PERSONAL BEFORE
INSERT ON PERSONAL FOR EACH ROW BEGIN
SELECT PERSONAL_SEQ.NEXTVAL INTO :new.PERSONAL_ID FROM dual;
END;

INSERT ALL 
INTO PERSONAL(DEPARTAMENTO_ID,NOMBRE,FECHA_NAC,CARGO)VALUES(1,'DOCTORES','06-08-1991','MEDICO RESPONSABLE')
INTO PERSONAL(DEPARTAMENTO_ID,NOMBRE,FECHA_NAC,CARGO)VALUES(2,'FARMACEUTICOS','07-09-1993','ESPECIALISTA')
INTO PERSONAL(DEPARTAMENTO_ID,NOMBRE,FECHA_NAC,CARGO)VALUES(3,'ENFERMERAS','07-05-1995','PERSONAL DE ENFERMERIA')
INTO PERSONAL(DEPARTAMENTO_ID,NOMBRE,FECHA_NAC,CARGO)VALUES(4,'DOCTORES','04-04-1990','MEDICO RESPONSABLE')
SELECT * FROM DUAL;
SELECT * FROM PERSONAL;
----SECUENCIA Y TRIGGER DEPARTAMENTOS
CREATE SEQUENCE DEPARTAMENTOS_SEQ START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER ON_DEPARTAMENTOS BEFORE
INSERT ON DEPARTAMENTOS FOR EACH ROW BEGIN
SELECT DEPARTAMENTOS_SEQ.NEXTVAL INTO :new.DEPARTAMENTO_ID FROM dual;
END;

INSERT ALL 
INTO DEPARTAMENTOS(DOCTOR_ID,DESCRIPCCION,N_PERSONAL)VALUES(1,'MEDICINA',7273732733)
INTO DEPARTAMENTOS(DOCTOR_ID,DESCRIPCCION,N_PERSONAL)VALUES(2,'MEDICINA',7273664747)
INTO DEPARTAMENTOS(DOCTOR_ID,DESCRIPCCION,N_PERSONAL)VALUES(3,'MEDICINA',7274555654)
INTO DEPARTAMENTOS(DOCTOR_ID,DESCRIPCCION,N_PERSONAL)VALUES(4,'MEDICINA',7275564224)
SELECT * FROM DUAL;
SELECT * FROM DEPARTAMENTOS;
----SECUENCIA Y TRIGGER DOCTORES
CREATE SEQUENCE DOCTORES_SEQ START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER ON_DOCTORES BEFORE
INSERT ON DOCTORES FOR EACH ROW BEGIN
SELECT DOCTORES_SEQ.NEXTVAL INTO :new.DOCTOR_ID FROM dual;
END;

INSERT ALL 
INTO DOCTORES(NOMBRE,ESPECIALIDAD,CEDULA,FECHA_NAC,SEXO)VALUES('ULISES','ANATOMIA','UHH37EU22','04-06-1990','M')
INTO DOCTORES(NOMBRE,ESPECIALIDAD,CEDULA,FECHA_NAC,SEXO)VALUES('DIANA','DERMATOLOGIA','DEC384JEE','04-06-1990','F')
INTO DOCTORES(NOMBRE,ESPECIALIDAD,CEDULA,FECHA_NAC,SEXO)VALUES('MARIA','DERMATOLOGIA','MGR53URJ3','04-06-1990','F')
INTO DOCTORES(NOMBRE,ESPECIALIDAD,CEDULA,FECHA_NAC,SEXO)VALUES('HERNESTO','CIRUJIA GENERAL','DEC384JEE','04-06-1990','M')
SELECT * FROM DUAL;
SELECT * FROM DOCTORES;
----SECUENCIA Y TRIGGER DIAGNOSTICO
CREATE SEQUENCE DIAGNOSTICO_SEQ START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER ON_DIAGNOSTICO BEFORE
INSERT ON DIAGNOSTICO FOR EACH ROW BEGIN
SELECT DIAGNOSTICO_SEQ.NEXTVAL INTO :new.DIAGNOSTICO_ID FROM dual;
END;

INSERT ALL 
INTO DIAGNOSTICO(DOCTOR_ID,PACIENTE_ID)VALUES('ULISES','ANATOMIA','UHH37EU22','04-06-1990','M')
INTO DOCTORES(NOMBRE,ESPECIALIDAD,CEDULA,FECHA_NAC,SEXO)VALUES('DIANA','DERMATOLOGIA','DEC384JEE','04-06-1990','F')
INTO DOCTORES(NOMBRE,ESPECIALIDAD,CEDULA,FECHA_NAC,SEXO)VALUES('MARIA','DERMATOLOGIA','MGR53URJ3','04-06-1990','F')
INTO DOCTORES(NOMBRE,ESPECIALIDAD,CEDULA,FECHA_NAC,SEXO)VALUES('HERNESTO','CIRUJIA GENERAL','DEC384JEE','04-06-1990','M')
SELECT * FROM DUAL;
SELECT * FROM DOCTORES;
----SECUENCIA Y TRIGGER PACIENTES
CREATE SEQUENCE PACIENTES_SEQ START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER ON_PACINTES BEFORE
INSERT ON PACIENTES FOR EACH ROW BEGIN
SELECT PACIENTES_SEQ.NEXTVAL INTO :new.PACIENTE_ID FROM dual;
END;

INSERT ALL 
INTO PACIENTES(NOMBRE,APELLIDO_P,APELLIDO_M,CURP,FECHA_NAC,NSS,SEXO,TIPO_SANGRE)VALUES('OLGA','GOMEZ','DURAN','OLGD83UEMD','09-08-2000','PLDHSE8R','F','O+')
INTO PACIENTES(NOMBRE,APELLIDO_P,APELLIDO_M,CURP,FECHA_NAC,NSS,SEXO,TIPO_SANGRE)VALUES('SANTIAGO','PEREZ','ROMAN','SPRUDU347','03-01-2002','3JE8443','M','O+')
INTO PACIENTES(NOMBRE,APELLIDO_P,APELLIDO_M,CURP,FECHA_NAC,NSS,SEXO,TIPO_SANGRE)VALUES('FERNANDA','ALVAREZ','ESTRADA','FAEDJE63D','04-04-1998','RI44RLE','F','O-')
INTO PACIENTES(NOMBRE,APELLIDO_P,APELLIDO_M,CURP,FECHA_NAC,NSS,SEXO,TIPO_SANGRE)VALUES('SOFIA','ESTRADA','HERNANDEZ','SEHWT3532','23-03-1997','484RRRE8','F','O+')
SELECT * FROM DUAL;
SELECT * FROM DOCTORES;