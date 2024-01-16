package com.example.ss2_v2.model;

import javax.persistence.*;

@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //HD-001, HD-002
    @Column(name = "code_student")
    private Integer codeStudent;
    @Column(name = "name_student", columnDefinition = "VARCHAR(100)")
    private String nameStudent;
    private Double point;
    private Integer gender;

    public Student() {
    }

    public Student(int codeStudent, String nameStudent, double point, Integer gender) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.point = point;
        this.gender = gender;
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
