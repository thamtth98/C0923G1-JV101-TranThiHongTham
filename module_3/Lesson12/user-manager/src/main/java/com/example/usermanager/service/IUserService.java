package com.example.usermanager.service;

import com.example.usermanager.model.Users;

import java.util.List;

public interface IUserService {
    List<Users> showList();

    void createUser(Users users);

    Users findById(int id);

    void editUser(Users users);

    void deleteUser(int id);

    List<Users> searchUser(String country);

    List<Users> sortByName(String sortOption);
}
