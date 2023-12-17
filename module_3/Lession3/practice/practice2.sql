use quan_ly_sinh_vien;
select * from student;

select * 
from student 
where student_status = true;

select sub_name
from st_subject
where credit < 10;

select student.student_id,student.student_name,grade.class_name
from student
join grade 
on student.class_id = grade.class_id
where grade.class_name = 'A1'; 

select student.student_id,student.student_name,st_subject.sub_name,mark.mark
from mark
join student
on student.student_id = mark.student_id
join st_subject
on st_subject.sub_id = mark.sub_id
where sub_name = "CF";
