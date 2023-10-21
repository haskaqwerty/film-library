CREATE TABLE  movies(id SERIAL PRIMARY KEY, name VARCHAR(100) NOT NULL, releasedyear NUMERIC (4,0),
directorFirstName VARCHAR(50), directorLastName VARCHAR(50), genre VARCHAR(30));
CREATE TABLE  directors(id SERIAL PRIMARY KEY, lastname VARCHAR(30) ,
    firstname VARCHAR(30) NOT NULL, datebirthday DATE);
CREATE TABLE  genres(id SERIAL PRIMARY KEY, name VARCHAR (30));