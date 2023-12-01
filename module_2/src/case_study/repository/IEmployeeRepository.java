package case_study.repository;

import case_study.models.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayEmployee();

    Employee findIdStaff(String idStaff);

    void editName(Employee employee, String name);

    void editDateOfBirth(Employee employee, String dateOfBirth);

    void editGender(Employee employee, String gender);

    void editPhoneNumber(Employee employee, Integer phoneNumber);

    void editIdNumber(Employee employee, Integer idNumber);

    void editEmail(Employee employee, String email);

    void editLevel(Employee employee, String level);

    void editPosition(Employee employee, String position);

    void editSalary(Employee employee, Long salary);

    void deleteEmployee(Employee employee);

    void addEmployee(Employee employee);

    List<Employee> findByName(String name);
}
