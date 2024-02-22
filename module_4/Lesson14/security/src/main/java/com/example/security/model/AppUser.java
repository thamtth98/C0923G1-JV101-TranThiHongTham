package com.example.security.model;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user",
        uniqueConstraints = {
                @UniqueConstraint(name = "APP_USER_UK", columnNames = "user_name")
        })
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String encrytedPassword;
    private boolean enable;

    public AppUser(Integer userId, String userName, String encrytedPassword, boolean enable) {
        this.userId = userId;
        this.userName = userName;
        this.encrytedPassword = encrytedPassword;
        this.enable = enable;
    }

    public AppUser() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
