package com.example.usermanage.service;

import com.example.usermanage.model.User;
import com.example.usermanage.repository.IUserRepository;
import com.example.usermanage.repository.UserRepository;

import java.util.List;

public class UserService implements IUserService{
    private IUserRepository userRepository = new UserRepository();
    @Override
    public List<User> showListUser() {
        return userRepository.showListUser();
    }

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public User findById(int id) {
       return userRepository.findById(id);
    }

    @Override
    public void editUser(User user) {
        userRepository.editUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    @Override
    public List<User> searchUser(String search) {
       return userRepository.searchUser(search);

    }

    @Override
    public List<User> sortUser(String sortOption) {
        return  userRepository.sortUser(sortOption);
    }
}
