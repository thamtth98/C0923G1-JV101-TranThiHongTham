use quan_ly_sinh_vien;
SELECT 
    *
FROM
    student
WHERE
    student_name LIKE 'h%';

SELECT 
    *
FROM
    grade
WHERE
    MONTH(start_date) = 12;

SELECT 
    *
FROM
    st_subject
WHERE
    credit >= 3 AND credit <= 5;

set sql_safe_updates = 0;
UPDATE student 
SET 
    class_id = 2
WHERE
    student_name = 'Hung';
set sql_safe_updates = 1;

SELECT 
    student.student_name, st_subject.sub_name, mark.mark
FROM
    mark
        JOIN
    student ON student.student_id = mark.student_id
        JOIN
    st_subject ON st_subject.sub_id = mark.sub_id
ORDER BY mark DESC , student_name;