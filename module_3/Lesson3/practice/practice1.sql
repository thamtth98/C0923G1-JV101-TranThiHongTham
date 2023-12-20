drop database if exists quan_ly_sinh_vien;
create database if not exists quan_ly_sinh_vien;
use quan_ly_sinh_vien;
create table grade(
class_id int primary key auto_increment,
class_name varchar(60) not null,
start_date datetime not null,
class_status bit
);
create table student(
student_id int primary key auto_increment,
student_name varchar(30) not null,
address varchar(50),
phone varchar(20),
student_status bit,
class_id int not null
);
create table st_subject(
sub_id int primary key auto_increment,
sub_name varchar(30) not null,
credit tinyint not null default 1 check (credit >= 1),
subject_status BIT DEFAULT 1
);
create table mark(
mark_id int not null auto_increment primary key,
mark float default 0 check(mark between 0 and 100),
exam_times tinyint default 1,
sub_id int not null,
student_id int not null,
unique(sub_id,student_id),
foreign key (sub_id) references st_subject(sub_id),
foreign key (student_id) references student(student_id)
 );
insert into grade
values (1,'A1','2008-12-20',1);
insert into grade
values (2, 'A2', '2008-12-22', 1);
insert into grade
values (3, 'B3', current_date, 0);

insert into student (student_name, address, phone, student_status, class_id)
values ('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into student (student_name, address, student_status, class_id)
values ('Hoa', 'Hai phong', 1, 1);
insert into student (student_name, address, phone, student_status, class_id)
values ('Manh', 'HCM', '0123123123', 0, 2);
insert into st_subject
values (1, 'CF', 5, 1),
 (2, 'C', 6, 1),
 (3, 'HDJ', 5, 1),
 (4, 'RDBMS', 10, 1);
insert into mark (sub_id, student_id, mark, exam_times)
values (1, 1, 8, 1),
 (1, 2, 10, 2),
 (2, 1, 12, 1);