package com.codegym.demo_springboot.service;

import com.codegym.demo_springboot.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    void save(Student student);

    Student getStudentById(int id);
}
