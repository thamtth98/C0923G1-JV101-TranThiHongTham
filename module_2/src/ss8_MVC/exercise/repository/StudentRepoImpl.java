package ss8_MVC.exercise.repository;

import ss8_MVC.exercise.model.Student;

//triển khai chức năng
public class StudentRepoImpl implements StudentRepo {
    private static Student[] studentList;
    private static int size;

    static {
        studentList = new Student[5];
        studentList[0] = new Student(1, "Thắm", 9);
        studentList[1] = new Student(2, "Vi", 9);
        studentList[2] = new Student(3, "Khánh", 9);
        studentList[3] = new Student(4, "Pháp", 9);
        size = 4;
    }

    @Override
    public Student[] findAll() {
        Student[] students = new Student[size];
        for(int i = 0; i < size; i++){
            students[i] = studentList[i];
        }
        return students;
    }

    @Override
    public void save(Student student) {
        //kiểm tra size có >10 không, nếu có thì tạo mảng mới

        //nếu nhỏ hơn thì thêm vào
        studentList[size] = student;
        size++;
    }
}
