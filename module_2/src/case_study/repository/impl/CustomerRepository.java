package case_study.repository.impl;

import case_study.models.person.Customer;
import case_study.models.person.Employee;
import case_study.repository.ICustomerRepository;
import case_study.utils.FileCustomer.ReadCustomerList;
import case_study.utils.FileCustomer.WriteCustomerList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList = ReadCustomerList.readCustomerList();
    }



    @Override
    public List<Customer> display() {
        return customerList;
    }

    @Override
    public Customer findId(String id) {
        for (Customer customer:customerList){
            if(customer.getIdCustomer().equalsIgnoreCase(id)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
        WriteCustomerList.writeCustomerFile(customerList);
    }
    @Override
    public void editName(Customer customer, String name) {
        customer.setName(name);
        WriteCustomerList.writeCustomerFile(customerList);
    }

    @Override
    public void editDateOfBirth(Customer customer, LocalDate dateOfBirth) {
        customer.setDateOfBirth(dateOfBirth);
        WriteCustomerList.writeCustomerFile(customerList);
    }

    @Override
    public void editGender(Customer customer, String gender) {
        customer.setGender(gender);
        WriteCustomerList.writeCustomerFile(customerList);
    }

    @Override
    public void editIdNumber(Customer customer, String idNumber) {
        customer.setIdNumber(idNumber);
        WriteCustomerList.writeCustomerFile(customerList);
    }

    @Override
    public void editPhoneNumber(Customer customer, String phoneNumber) {
        customer.setPhoneNumber(phoneNumber);
        WriteCustomerList.writeCustomerFile(customerList);
    }

    @Override
    public void editEmail(Customer customer, String email) {
        customer.setEmail(email);
        WriteCustomerList.writeCustomerFile(customerList);
    }

    @Override
    public void editTypeCustomer(Customer customer, String typeCustomer) {
        customer.setTypeCustomer(typeCustomer);
        WriteCustomerList.writeCustomerFile(customerList);
    }

    @Override
    public void editAddress(Customer customer, String address) {
        customer.setAddress(address);
        WriteCustomerList.writeCustomerFile(customerList);
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer>customerByName = new ArrayList<>();
        for (Customer customer:customerList){
            if(customer.getName().contains(name)){
                customerByName.add(customer);
            }
        }
        return customerByName;
    }


    @Override
    public void delete(Customer customer) {
        customerList.remove(customer);
        WriteCustomerList.writeCustomerFile(customerList);
    }
}
