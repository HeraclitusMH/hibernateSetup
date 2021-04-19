DROP TABLE PERSON;

/*
DROP TABLE POSSEDIMENTI;
DROP TABLE PERSON;
DROP TABLE UMANO;

 CREATE TABLE UMANO
 ( idUmano varchar(255) NOT NULL,
   anima number(1) NOT NULL,
   PRIMARY KEY (idUmano)
 );

 CREATE TABLE PERSON
 (
   idPerson varchar(255) NOT NULL,
   firstName varchar(255) NOT NULL,
   lastName varchar(255) NOT NULL,
   UMANO_ID varchar(255),
   FOREIGN KEY (UMANO_ID) REFERENCES UMANO(idUmano),
   PRIMARY KEY (idPerson)
 );

 CREATE TABLE POSSEDIMENTI
 ( idPossedimenti int NOT NULL AUTO_INCREMENT,
   tipoPossedimenti varchar(255) NOT NULL,
   UMANO_ID varchar(255),
   FOREIGN KEY (UMANO_ID) REFERENCES UMANO(idUmano),
   PRIMARY KEY (idPossedimenti)
 );
*/



