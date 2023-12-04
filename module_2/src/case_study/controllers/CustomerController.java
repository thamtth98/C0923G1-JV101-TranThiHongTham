package case_study.controllers;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.services.ICustomerService;
import case_study.services.impl.CustomerService;

import java.time.LocalDate;
import java.util.List;

public class CustomerController {
private static ICustomerService iCustomerService= new CustomerService();



    public List<Customer> display() {
        return iCustomerService.display();
    }

    public Customer findId(String id) {
        return iCustomerService.findId(id);
    }

    public void add(Customer customer) {
        iCustomerService.add(customer);
    }
    public static void editName(Customer customer, String name) {
        iCustomerService.editName(customer,name);
    }
    public void editDateOfBirth(Customer customer, LocalDate dateOfBirth) {
        iCustomerService.editDateOfBirth(customer,dateOfBirth);
    }

    public void editGender(Customer customer, String gender) {
        iCustomerService.editGender(customer,gender);
    }

    public void editIdNumber(Customer customer, String idNumber) {
        iCustomerService.editIdNumber(customer,idNumber);
    }

    public void editPhoneNumber(Customer customer, String phoneNumber) {
        iCustomerService.editPhoneNumber(customer,phoneNumber);
    }

    public void editEmail(Customer customer, String email) {
        iCustomerService.editEmail(customer,email);
    }

    public void editTypeCustomer(Customer customer, String typeCustomer) {
        iCustomerService.editTypeCustomer(customer,typeCustomer);
    }

    public void editAddress(Customer customer, String address) {
        iCustomerService.editAddress(customer,address);
    }


    public void deleteCustomer(Customer customer) {
        iCustomerService.delete(customer);
    }

    public List<Customer> findByName(String name) {
        return iCustomerService.findByName(name);
    }
}
