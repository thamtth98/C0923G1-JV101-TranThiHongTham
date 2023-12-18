use quan_ly_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
SELECT 
    st_subject.*
FROM
    st_subject
WHERE
    credit = (SELECT 
            MAX(credit)
        FROM
            st_subject);
-- hoặc
SELECT 
    *
FROM
    st_subject
ORDER BY st_subject.sub_id DESC
LIMIT 1;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT 
    st_subject.*
FROM
    st_subject
        JOIN
    mark ON st_subject.sub_id = mark.sub_id
WHERE
    mark.mark = (SELECT 
            MAX(mark.mark)
        FROM
            mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
SELECT 
    student.*, AVG(mark.mark) AS average_mark
FROM
    student
        JOIN
    mark ON student.student_id = mark.student_id
GROUP BY student.student_id , student.student_name
ORDER BY average_mark DESC;

