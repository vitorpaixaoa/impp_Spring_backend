CREATE DATABASE IF NOT EXISTS impp_db ;

CREATE TABLE users
(
    USER_ID INT NOT NULL AUTO_INCREMENT,
    USER_NAME VARCHAR (60) NOT NULL,
    PRIMARY KEY (USER_ID)
);

INSERT INTO users
VALUES
    (1, 'João' ),
    (2, 'Maria' ),
    (3, 'Zeca' ),
    (4, 'Mario'),
    (5, 'Gustavo'),
    (6, 'Camila'),
    (7, 'Pedro' ),
    (8, 'Juliana'),
    (9, 'Gisele ');
