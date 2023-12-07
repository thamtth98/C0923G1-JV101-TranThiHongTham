package mvc.services.impl;

import mvc.models.Student;
import mvc.repositories.IStudentRepository;
import mvc.repositories.impl.StudentRepository;
import mvc.services.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public List<Student> showList() {
        return iStudentRepository.showList();
    }

    @Override
    public void addStudent(Student student) {
        iStudentRepository.addStudent(student);
    }

    @Override
    public Student findIdStudent(String idStudent) {
        return iStudentRepository.findIdStudent(idStudent);
    }

    @Override
    public void remove(Student student) {
        iStudentRepository.remove(student);
    }
}
