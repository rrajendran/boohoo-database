DROP TABLE USER;

CREATE TABLE User (
  id int(11) NOT NULL AUTO_INCREMENT,
  firstname varchar(255) DEFAULT NULL,
  lastname varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);