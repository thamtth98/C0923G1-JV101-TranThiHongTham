package mvc.repositories;

import mvc.models.Student;

import java.util.List;

public interface IStudentRepository {

    List<Student> showList();

    void addStudent(Student student);

    Student findIdStudent(String idStudent);

    void remove(Student student);
}
