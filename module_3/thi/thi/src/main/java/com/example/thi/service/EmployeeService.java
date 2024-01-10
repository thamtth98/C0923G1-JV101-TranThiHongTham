package com.example.thi.service;

import com.example.thi.model.Employee;
import com.example.thi.repository.EmployeeRepository;
import com.example.thi.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> showListEmployee() {
        return employeeRepository.showListEmployee();
    }

    @Override
    public void createEmpl(Employee employee) {
         employeeRepository.createEmpl(employee);
    }

    @Override
    public void deleteEmpl(int idEmpl) {
        employeeRepository.deleteEmpl(idEmpl);
    }

    @Override
    public List<Employee> searchEmp(String search) {
        return employeeRepository.searchEmp(search);
    }
}
