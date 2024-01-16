package com.example.ss2_v2.service;

import com.example.ss2_v2.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    void save(Student student);

    Student getStudentById(int id);
}
