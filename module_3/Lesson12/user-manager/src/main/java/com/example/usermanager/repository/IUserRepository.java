package com.example.usermanager.repository;

import com.example.usermanager.model.Users;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {


    List<Users> showList();

    void createUser(Users users);

    Users findById(int id);

    void editUser(Users users);

    void deleteUser(int id);

    List<Users> searchUser(String country);

    List<Users> sortByName(String sortOption);
}
