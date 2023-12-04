package case_study.services.impl;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.services.ICustomerService;

import java.time.LocalDate;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> display() {
        return iCustomerRepository.display();
    }

    @Override
    public Customer findId(String id) {
        return iCustomerRepository.findId(id);
    }

    @Override
    public void add(Customer customer) {
        iCustomerRepository.add(customer);
    }

    @Override
    public void editName(Customer customer, String name) {
        iCustomerRepository.editName(customer, name);

    }

    @Override
    public void editDateOfBirth(Customer customer, LocalDate dateOfBirth) {
        iCustomerRepository.editDateOfBirth(customer, dateOfBirth);
    }

    @Override
    public void editGender(Customer customer, String gender) {
        iCustomerRepository.editGender(customer, gender);
    }

    @Override
    public void editIdNumber(Customer customer, String idNumber) {
        iCustomerRepository.editIdNumber(customer, idNumber);
    }

    @Override
    public void editPhoneNumber(Customer customer, String phoneNumber) {
        iCustomerRepository.editPhoneNumber(customer, phoneNumber);

    }

    @Override
    public void editEmail(Customer customer, String email) {
        iCustomerRepository.editEmail(customer, email);

    }

    @Override
    public void editTypeCustomer(Customer customer, String typeCustomer) {
        iCustomerRepository.editTypeCustomer(customer, typeCustomer);

    }

    @Override
    public void editAddress(Customer customer, String address) {
        iCustomerRepository.editAddress(customer, address);

    }

    @Override
    public List<Customer> findByName(String name) {
        return iCustomerRepository.findByName(name);
    }

    @Override
    public void delete(Customer customer) {
        iCustomerRepository.delete(customer);
    }

}
