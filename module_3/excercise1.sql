drop database if exists student_management;
create database if not exists student_management;
use student_management;
create table class(
id_class int primary key auto_increment,
name_class varchar(50)
);
create table teacher(
id_teacher int primary key auto_increment,
name_teacher varchar(50),
age int,
country varchar(100),
id_class int ,
foreign key (id_class) references class(id_class)
);
insert into class(name_class) values ("Thắm"); 
insert into teacher(name_teacher,age,country,id_class) values ("Hải TT",18,"ĐN",1); 
insert into class(name_class) values ("Khánh"); 
insert into teacher(name_teacher,age,country,id_class) values ("Công",29,"ĐN",1 ); 