package com.example.listcustomer;

public class Customer {
    private String nameCustomer;
    private String birthday;
    private String address;
    private String urlImage;

    public Customer(String nameCustomer, String birthday, String address, String urlImage) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.address = address;
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Customer(String nameCustomer, String birthday, String address) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.address = address;
    }

    public Customer() {
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
