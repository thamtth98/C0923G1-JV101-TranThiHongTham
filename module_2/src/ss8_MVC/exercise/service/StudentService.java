package ss8_MVC.exercise.service;

import ss8_MVC.exercise.model.Student;

//service thừng dùng để tạo CRUD, SORT, SEARCH, VALIDATION
//khai báo các thuộc tính cần lấy dữ liệu từ database
public interface StudentService {
    Student[] findAll();

    void save(Student student);
}
