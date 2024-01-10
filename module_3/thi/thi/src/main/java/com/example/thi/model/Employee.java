package com.example.thi.model;

public class Employee {
    private Integer idEmployee;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Integer salary;
    private Integer idDepartment;
    private String nameDepartment;

    public Employee(Integer idEmployee, String name, String email, String address, String phoneNumber, Integer salary, Integer idDepartment, String nameDepartment) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.idDepartment = idDepartment;
        this.nameDepartment = nameDepartment;
    }

    public Employee() {
    }

    public Employee(String name, String email, String address, String phoneNumber, int salary, String nameDepartment) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.nameDepartment = nameDepartment;
    }
    public Employee(String name, String email, String address, String phoneNumber, int salary) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
}
