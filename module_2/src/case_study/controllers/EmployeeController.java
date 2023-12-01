package case_study.controllers;

import case_study.models.person.Employee;
import case_study.services.IEmployeeService;
import case_study.services.impl.EmployeeService;

import java.time.LocalDate;
import java.util.List;

public class EmployeeController {
    public static IEmployeeService iEmployeeService= new EmployeeService();

    public List<Employee> displayEmployee() {
        return iEmployeeService.displayEmployee();
    }
    public void addEmployee(Employee employee) {
        iEmployeeService.addEmployee(employee);
    }


    public Employee findIdStaff(String idStaff) {
        return iEmployeeService.findIdStaff(idStaff);
    }



    public void editName(Employee employee, String name) {
        iEmployeeService.editName(employee,name);
    }


    public void editDateOfBirth(Employee employee, LocalDate dateOfBirth) {
        iEmployeeService.editDateOfBirth(employee,dateOfBirth);
    }
    public void editGender(Employee employee, String gender) {
        iEmployeeService.editGender(employee,gender);
    }

    public void editIdNumber(Employee employee, String idNumber) {
        iEmployeeService.editIdNumber(employee,idNumber);
    }
    public void editPhoneNumber(Employee employee, String phoneNumber) {
        iEmployeeService.editPhoneNumber(employee,phoneNumber);
    }
    public void editEmail(Employee employee, String email) {
        iEmployeeService.editEmail(employee,email);
    }
    public void editLevel(Employee employee, String level) {
        iEmployeeService.editLevel(employee,level);
    }

    public void editPosition(Employee employee, String position) {
        iEmployeeService.editPosition(employee,position);
    }

    public void editSalary(Employee employee, Long salary) {
        iEmployeeService.editSalary(employee,salary);
    }


    public void deleteEmployee(Employee employee) {
        iEmployeeService.deleteEmployee(employee);
    }


    public List<Employee> findByName(String name) {
        return iEmployeeService.findByName(name);
    }


}
