package com.example.security.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_role",
uniqueConstraints = {
        @UniqueConstraint(name = "USER_ROLE_UK",columnNames = {"user_id","role_id"})
})
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUserRole;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private AppUser appUser;
    @ManyToOne
    @JoinColumn(name = "role_id",nullable = false)
    private AppRole appRole;

    public UserRole(Integer idUserRole, AppUser appUser, AppRole appRole) {
        this.idUserRole = idUserRole;
        this.appUser = appUser;
        this.appRole = appRole;
    }

    public UserRole() {
    }

    public Integer getIdUserRole() {
        return idUserRole;
    }

    public void setIdUserRole(Integer idUserRole) {
        this.idUserRole = idUserRole;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public AppRole getAppRole() {
        return appRole;
    }

    public void setAppRole(AppRole appRole) {
        this.appRole = appRole;
    }
}
