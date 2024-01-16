package com.example.ss2_v2.service.impl;

import com.example.ss2_v2.model.Student;
import com.example.ss2_v2.repository.IStudentRepository;
import com.example.ss2_v2.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public List<Student> getAll() {
        return iStudentRepository.getAll();
    }

    @Override
    public void save(Student student) {
        this.iStudentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return iStudentRepository.getStudentById(id);
    }
}
