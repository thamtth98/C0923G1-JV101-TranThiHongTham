package mvc.services;

import mvc.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> showList();

    void addStudent(Student student);

    Student findIdStudent(String idStudent);

    void remove(Student student);
}
