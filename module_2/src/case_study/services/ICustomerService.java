package case_study.services;

import case_study.models.person.Customer;
import case_study.models.person.Employee;

import java.security.Provider;
import java.time.LocalDate;
import java.util.List;

public interface ICustomerService extends IService<Customer> {

    void editName(Customer customer, String name);

    void editDateOfBirth(Customer customer, LocalDate dateOfBirth);

    void editGender(Customer customer, String gender);

    void editIdNumber(Customer customer, String idNumber);

    void editPhoneNumber(Customer customer, String phoneNumber);

    void editEmail(Customer customer, String email);

    void editTypeCustomer(Customer customer, String typeCustomer);

    void editAddress(Customer customer, String address);

    List<Customer> findByName(String name);
}
