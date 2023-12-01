package case_study.models.person;

import java.util.Date;

public class Employee extends Person{
    private String idStaff;
    private String level;
    private String position;
    private Long salary;

    public Employee(String idStaff, String level, String position, Long salary) {
        this.idStaff = idStaff;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String idStaff, String name, String dateOfBirth, String gender, Integer idNumber, Integer phoneNumber, String email, String level, String position, Long salary) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.idStaff = idStaff;
        this.level = level;
        this.position = position;
        this.salary = salary;
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idStaff='" + idStaff + '\'' +
                ", name='" + super.getName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth()+
                ", gender='" + super.getGender() + '\'' +
                ", idNumber=" + super.getIdNumber() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email='" + super.getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} ";
    }
}
