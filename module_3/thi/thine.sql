drop database if exists employee_manage;
create database if not exists employee_manage;
use employee_manage;

create table department (
id int primary key auto_increment,
name_d char(200) not null
);
create table employee (
id int primary key auto_increment,
name_e char(200) not null,
email char(200) not null,
address char(200) not null,
tele_phone char(12) not null,
salary int not null,
department char(100) not null
-- foreign key(department) 
);