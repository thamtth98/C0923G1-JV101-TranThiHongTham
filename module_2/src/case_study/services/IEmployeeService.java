package case_study.services;

import case_study.models.person.Employee;

import java.time.LocalDate;
import java.util.List;

public interface IEmployeeService extends IService<Employee>{

    void editName(Employee employee, String name);

    void editDateOfBirth(Employee employee, LocalDate dateOfBirth);

    void editGender(Employee employee, String gender);

    void editIdNumber(Employee employee, String idNumber);

    void editPhoneNumber(Employee employee, String phoneNumber);

    void editEmail(Employee employee, String email);
    void editLevel(Employee employee, String level);

    void editPosition(Employee employee, String position);

    void editSalary(Employee employee, Long salary);


    List<Employee> findByName(String name);

}
