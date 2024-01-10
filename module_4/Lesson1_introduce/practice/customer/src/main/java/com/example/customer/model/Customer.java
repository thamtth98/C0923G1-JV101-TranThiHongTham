package com.example.customer.model;

public class Customer {
    private String idCustomer;
    private String name;
    private String email;
    private String address;

    public Customer(String idCustomer, String name, String email, String address) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Customer() {
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
