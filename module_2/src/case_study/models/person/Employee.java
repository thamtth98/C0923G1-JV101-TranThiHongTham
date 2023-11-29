package case_study.models.person;

import java.util.Date;

public class Employee extends Person{
    private String idStaff;
    private String level;
    private String position;
    private Double salary;

    public Employee(String idStaff, String level, String position, Double salary) {
        this.idStaff = idStaff;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, Date dateOfBirth, String gender, Integer idNumber, Integer phoneNumber, String email, String idStaff, String level, String position, Double salary) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.idStaff = idStaff;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth()+
                ", gender='" + super.getGender() + '\'' +
                ", idNumber=" + super.getIdNumber() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email='" + super.getEmail() + '\'' +
                "idStaff='" + idStaff + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} ";
    }
}
