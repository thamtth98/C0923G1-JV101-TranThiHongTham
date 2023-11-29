package case_study.repository.impl;

import case_study.models.person.Employee;
import case_study.models.person.Person;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employee = new ArrayList<>();
    @Override
    public List<Employee> displayEmployee() {

        return employee;
    }
}
