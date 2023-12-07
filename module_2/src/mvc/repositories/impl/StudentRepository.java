package mvc.repositories.impl;


import mvc.models.Student;
import mvc.repositories.IStudentRepository;
import mvc.utils.ReaderStudent;
import mvc.utils.WriterStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList = ReaderStudent.readFile();
    }
    @Override
    public List<Student> showList() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
        WriterStudent.writeStudent(studentList);
    }

    @Override
    public Student findIdStudent(String idStudent) {
        for (Student student:studentList){
            if(student.getIdStudent().equalsIgnoreCase(idStudent)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void remove(Student student) {
        studentList.remove(student);
        WriterStudent.writeStudent(studentList);
    }
}
