package com.example.ss2_v2.repository.impl;

import com.example.ss2_v2.model.Student;
import com.example.ss2_v2.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "haiTT", 9, 1));
        students.add(new Student(2, "haiTT2", 3, 0));
        students.add(new Student(3, "haiTT3", 6, 1));
        students.add(new Student(4, "haiTT4", 8, null));
        students.add(new Student(5, "haiTT5", 5, 1));
    }

    @Override
    public List<Student> getAll() {
        //HQL
        List<Student> students = BaseRepository.entityManager.createQuery("select s from student s", Student.class).getResultList();
        return students;
    }

    @Override
    public void save(Student student) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(student);
        entityTransaction.commit();
    }

    @Override
    public Student getStudentById(int id) {
        Student student = BaseRepository.entityManager.createQuery("select s from student s WHERE codeStudent = :code", Student.class)
                .setParameter("code", id).getSingleResult();
        return student;
    }
}
