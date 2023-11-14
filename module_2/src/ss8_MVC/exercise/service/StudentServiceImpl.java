package ss8_MVC.exercise.service;

import ss8_MVC.exercise.model.Student;

public class StudentServiceImpl implements StudentService {
    private StudentService repo = new StudentServiceImpl();
    @Override
    public Student[] findAll() {
        return repo.findAll();
    }

    @Override
    public void save(Student student) {
        repo.save(student);
    }

}
