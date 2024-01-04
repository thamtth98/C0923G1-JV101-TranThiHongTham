package com.example.usermanager.service;

import com.example.usermanager.model.Users;
import com.example.usermanager.repository.IUserRepository;
import com.example.usermanager.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService{
    private IUserRepository userRepository = new UserRepository();
    @Override
    public List<Users> showList() {
        return userRepository.showList();
    }

    @Override
    public void createUser(Users users) {
        userRepository.createUser(users);
    }

    @Override
    public Users findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void editUser(Users users) {
        userRepository.editUser(users);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    @Override
    public List<Users> searchUser(String country) {
        return userRepository.searchUser(country);
    }

    @Override
    public List<Users> sortByName(String sortOption) {
        return  userRepository.sortByName(sortOption);
    }
}
