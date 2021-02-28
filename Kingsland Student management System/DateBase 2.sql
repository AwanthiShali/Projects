DROP DATABASE IF EXISTS kingslandStudentManagementSystem;
CREATE DATABASE IF NOT EXISTS kingslandStudentManagementSystem;

CREATE TABLE student(
studentID VARCHAR(10) NOT NULL PRIMARY KEY,
studentName VARCHAR (45) NOT NULL,
address VARCHAR(45) NOT NULL,
contact VARCHAR(45) NOT NULL,
dob DATE,
gender VARCHAR(45)
);

CREATE TABLE course(
codeID VARCHAR(20) NOT NULL PRIMARY KEY ,
courseName VARCHAR(45) NOT NULL ,
duration VARCHAR(20) NOT NULL ,
registrationFee DOUBLE(10,2) NOT NULL,
intake VARCHAR(20) NOT NULL
);

CREATE TABLE registration(
regNo INT AUTO_INCREMENT PRIMARY KEY ,
regDate VARCHAR(45) NOT NULL ,
registrationFee DOUBLE(10,2) NOT NULL ,
studentID VARCHAR(10) NOT NULL,
codeID VARCHAR(20) NOT NULL,
CONSTRAINT FOREIGN KEY (studentID) REFERENCES student(studentID),
CONSTRAINT FOREIGN KEY (codeID) REFERENCES course(codeID)
);

insert into course values
	('C001', 'ABCD', '1 year', 50000, 'fall,spring'),
	('C002', 'BCSC', '3 year', 70000, 'fall,spring,summer'),
	('C003', 'DFHS', '3 year', 60000, 'spring');

	insert into student values
	('S001', 'udara', 'NO 69 paraththa', 0715466983, '2000-01-07','malel');
