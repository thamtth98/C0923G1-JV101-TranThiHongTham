package ss8_MVC.exercise.repository;

import ss8_MVC.exercise.model.Student;

public interface StudentRepo {
    //khung chức năng chính cho cả chương trình
    Student[] findAll();

    void save(Student student);
}
