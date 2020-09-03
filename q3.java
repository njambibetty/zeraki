CREATE DATABASE education;

CREATE TABLE student(
    studentid int(11) IS NOT NULL PRIMARY KEY,
    name varchar(250),
    course int(11)
);

CREATE TABLE course(
    courseid int(11) IS NOT NULL PRIMARY KEY,
    name varchar(250),
    institution int(11)
 );

CREATE TABLE institution(
    name varchar(250) IS NOT NULL PRIMARY KEY,
    institutionid int(11)  
 
);

//q3b
 SELECT institutionName, courseName, numberOfStudents;
 FROM education;
 

