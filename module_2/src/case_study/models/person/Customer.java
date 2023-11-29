package case_study.models.person;

import java.util.Date;

public class Customer extends Person{
private String idCustomer;
private String typeCustomer;
private String address;

    public Customer(String name, Date dateOfBirth, String gender, Integer idNumber, Integer phoneNumber, String email, String idCustomer, String typeCustomer, String address) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(String idCustomer, String typeCustomer, String address) {
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(){
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + super.getName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                ", gender='" + super.getGender() + '\'' +
                ", idNumber=" + super.getIdNumber() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email='" + super.getEmail() + '\'' +
                "idCustomer='" + idCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                "} ";
    }
}
