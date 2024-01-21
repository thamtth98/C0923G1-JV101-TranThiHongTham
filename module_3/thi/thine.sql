drop database if exists employee_manage;
create database if not exists employee_manage;
use employee_manage;

create table department (
id_d int primary key auto_increment,
name_d char(200) not null
);
create table employee (
id_e int primary key auto_increment,
name_e char(200) not null,
email char(200) not null,
address char(200) not null,
tele_phone char(12) not null,
salary int not null,
id_department int,
 foreign key(id_department) references department(id_d)
);
INSERT INTO `employee_manage`.`department` (`id_d`, `name_d`) VALUES ('1', 'Van phong');
INSERT INTO `employee_manage`.`department` (`id_d`, `name_d`) VALUES ('2', 'Xuong');

	INSERT INTO `employee_manage`.`employee` (`id_e`, `name_e`, `email`, `address`, `tele_phone`, `salary`, `id_department`) VALUES ('1', 'Tui', 'dsd@gmail', 'HN', '0987654321', '10', '1');
	INSERT INTO `employee_manage`.`employee` (`id_e`, `name_e`, `email`, `address`, `tele_phone`, `salary`, `id_department`) VALUES ('2', 'Kha', 'kha@gmail.com', 'DN', '0123456789', '11', '2');

SELECT * FROM employee
join department
on department.id_d = employee.id_department;
