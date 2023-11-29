package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.services.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> displayEmployee() {
        return iEmployeeRepository.displayEmployee();
    }
}
