package mvc.controllers;

import mvc.models.Student;
import mvc.services.IStudentService;
import mvc.services.impl.StudentService;

import java.util.List;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    public List<Student> showList() {
        return iStudentService.showList();
    }

    public void addStudent(Student student) {
        iStudentService.addStudent(student);
    }

    public Student findIdStudent(String idStudent) {
        return iStudentService.findIdStudent(idStudent);
    }

    public void remove(Student student) {
        iStudentService.remove(student);
    }
}
