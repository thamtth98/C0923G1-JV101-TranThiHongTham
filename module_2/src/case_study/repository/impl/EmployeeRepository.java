package case_study.repository.impl;

import case_study.models.person.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.utils.FileEmployee.ReadEmployeeList;
import case_study.utils.FileEmployee.WriteEmployee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList = ReadEmployeeList.readEmployeeList();
    }

    @Override
    public List<Employee> display() {
        return employeeList;
    }
    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public Employee findId(String idStaff) {
        for (Employee employee : employeeList) {
            if (employee.getIdStaff().equalsIgnoreCase(idStaff)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void editName(Employee employee, String name) {
        employee.setName(name);
        WriteEmployee.writeFile(employeeList);

    }

    @Override
    public void editDateOfBirth(Employee employee, LocalDate dateOfBirth) {
        employee.setDateOfBirth(dateOfBirth);
        WriteEmployee.writeFile(employeeList);
    }


    @Override
    public void editGender(Employee employee, String gender) {
        employee.setGender(gender);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public void editPhoneNumber(Employee employee, String phoneNumber) {
        employee.setPhoneNumber(phoneNumber);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public void editIdNumber(Employee employee, String idNumber) {
        employee.setIdNumber(idNumber);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public void editEmail(Employee employee, String email) {
        employee.setEmail(email);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public void editLevel(Employee employee, String level) {
        employee.setLevel(level);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public void editPosition(Employee employee, String position) {
        employee.setLevel(position);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public void editSalary(Employee employee, Long salary) {
        employee.setSalary(salary);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public void delete(Employee employee) {
        employeeList.remove(employee);
        WriteEmployee.writeFile(employeeList);
    }

    @Override
    public List<Employee> findByName(String name) {
        List<Employee>employeeByName = new ArrayList<>();
        for (Employee employee:employeeList){
            if(employee.getName().contains(name)){
                employeeByName.add(employee);
            }
        }
        return employeeByName;
    }
}
