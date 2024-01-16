package com.example.ss2_v2.repository;

import com.example.ss2_v2.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();

    void save(Student student);

    Student getStudentById(int id);
}
