package com.example.form.service;

import com.example.form.model.User;
import com.example.form.repository.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    private IUserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
