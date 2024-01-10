package com.example.thi.service;

import com.example.thi.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> showListEmployee();

    void createEmpl(Employee employee);

    void deleteEmpl(int idEmpl);

    List<Employee> searchEmp(String search);
}
