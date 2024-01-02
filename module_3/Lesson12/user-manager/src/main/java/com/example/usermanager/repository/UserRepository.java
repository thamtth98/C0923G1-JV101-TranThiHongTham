package com.example.usermanager.repository;

import com.example.usermanager.model.Users;

import java.sql.SQLException;
import java.util.List;

public class UserDAO implements IUserDAO{
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456789";


    @Override
    public void insertUser(Users user) throws SQLException {

    }

    @Override
    public Users selectUser(int id) {
        return null;
    }

    @Override
    public List<Users> selectAllUsers() {
        return null;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(Users user) throws SQLException {
        return false;
    }
}

