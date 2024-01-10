package com.example.usermanage.service;

import com.example.usermanage.model.User;

import java.util.List;

public interface IUserService {
    List<User> showListUser();

    void createUser(User user);

    User findById(int id);

    void editUser(User user);

    void deleteUser(int id);

    List<User> searchUser(String search);

    List<User> sortUser(String sortOption);
}
