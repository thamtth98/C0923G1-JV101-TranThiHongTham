package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.services.IEmployeeService;

import java.time.LocalDate;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> display() {
        return iEmployeeRepository.display();
    }

    @Override
    public Employee findId(String idStaff) {
        return iEmployeeRepository.findId(idStaff);
    }

    @Override
    public void add(Employee employee) {
        iEmployeeRepository.add(employee);
    }

    @Override
    public void editName(Employee employee, String name) {
        iEmployeeRepository.editName(employee,name);
    }

    @Override
    public void editDateOfBirth(Employee employee, LocalDate dateOfBirth) {
        iEmployeeRepository.editDateOfBirth(employee,dateOfBirth);
    }


    @Override
    public void editGender(Employee employee, String gender) {
        iEmployeeRepository.editGender(employee,gender);
    }

    @Override
    public void editIdNumber(Employee employee, String idNumber) {
        iEmployeeRepository.editIdNumber(employee,idNumber);
    }

    @Override
    public void editPhoneNumber(Employee employee, String phoneNumber) {
        iEmployeeRepository.editPhoneNumber(employee,phoneNumber);
    }

    @Override
    public void editEmail(Employee employee, String email) {
        iEmployeeRepository.editEmail(employee,email);
    }

    @Override
    public void editLevel(Employee employee, String level) {
        iEmployeeRepository.editLevel(employee,level);
    }

    @Override
    public void editPosition(Employee employee, String position) {
        iEmployeeRepository.editPosition(employee,position);
    }


    @Override
    public void editSalary(Employee employee, Long salary) {
        iEmployeeRepository.editSalary(employee,salary);
    }

    @Override
    public void delete(Employee employee) {
        iEmployeeRepository.delete(employee);
    }

    @Override
    public List<Employee> findByName(String name) {
        return iEmployeeRepository.findByName(name);
    }
}
