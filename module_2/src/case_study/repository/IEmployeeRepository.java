package case_study.repository;

import case_study.models.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayEmployee();
}
