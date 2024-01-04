drop database if exists user_management;
create database if not exists user_management;

USE user_management; 
create table users (
      id int(3) NOT NULL AUTO_INCREMENT, 
      name_user varchar(120) NOT NULL, 
      email varchar(220) NOT NULL, 
      country varchar(120), 
      PRIMARY KEY (id) 
);
insert into users(name_user, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name_user, email, country) values('Kante','kante@che.uk','Kenia');