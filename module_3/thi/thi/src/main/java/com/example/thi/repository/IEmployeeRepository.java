package com.example.thi.repository;

import com.example.thi.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> showListEmployee();

    void createEmpl(Employee employee);

    void deleteEmpl(int idEmpl);

    List<Employee> searchEmp(String search);
}
