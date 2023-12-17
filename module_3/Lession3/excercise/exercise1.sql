use quan_ly_sinh_vien;
select * 
from student
where student_name like 'h%';

select * 
from grade
where month(start_date) = 12;

select *
from st_subject
where credit >= 3 and credit <= 5;

update student
set class_id = 2
where student_name = 'Hung';

select student.student_name,st_subject.sub_name,mark.mark
from mark
join student
on student.student_id = mark.student_id
join st_subject
on st_subject.sub_id = mark.sub_id
order by mark desc, student_name;