package com.example.democ09.model;

public class Person {
    private Integer personId;

    private String lastName;

    private String firstName;

    private String address;

    private String city;

    public Person() {
    }

    public Person(Integer personId, String lastName, String firstName, String address, String city) {
        this.personId = personId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
