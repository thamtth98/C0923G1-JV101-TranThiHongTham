package com.example.usermanager.repository;

import com.example.usermanager.model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    public static final String SELECT_FROM_USERS = "SELECT * FROM users";
    private static final String SELECT_USER_BY_ID = "select * from users where id = ?";
    public static final String UPDATE_USERS = "UPDATE `users` SET `name_user` = ?, `email` = ?, `country` = ? WHERE (`id` = ?)";
    public static final String DELETE_USER = "DELETE FROM `users` WHERE (`id` = ?)";


    @Override
    public List<Users> showList() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Users> usersList = new ArrayList<>();
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_FROM_USERS);
                resultSet = statement.executeQuery();
                Users users = null;
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nameUser = resultSet.getString("name_user");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");

                    users = new Users(id, nameUser, email, country);
                    usersList.add(users);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return usersList;
    }

    @Override
    public void createUser(Users users) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement("insert into users(name_user, email, country)" +
                        "values(?,?,?)");
                statement.setString(1, users.getName());
                statement.setString(2, users.getEmail());
                statement.setString(3, users.getCountry());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public Users findById(int id) {
        Users user = null;
        ResultSet result = null;
        PreparedStatement preparedStatement = null;
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
                preparedStatement.setInt(1, id);
                System.out.println(preparedStatement);
                result = preparedStatement.executeQuery();

                while (result.next()) {
                    id = result.getInt("id");
                    String name = result.getString("name_user");
                    String email = result.getString("email");
                    String country = result.getString("country");
                    user = new Users(id, name, email, country);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if(result !=null){
                    try {
                        result.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if(preparedStatement !=null){
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                DBConnection.close();
            }
        }
        return user;

    }


    @Override
    public void editUser(Users users) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_USERS);
            statement.setString(1, users.getName());
            statement.setString(2, users.getEmail());
            statement.setString(3, users.getCountry());
            statement.setInt(4, users.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteUser(int id) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Users> searchUser(String country) {
        List<Users> usersList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet =null;
        try {
            preparedStatement = connection.prepareStatement("select * from users where country like ?");
            preparedStatement.setString(1,country);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nameUser = resultSet.getString("name_user");
                String email = resultSet.getString("email");
                String countryside = resultSet.getString("country");
                Users user = new Users(id, nameUser, email, countryside);
                usersList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(resultSet !=null){
                try {
                    resultSet.close();
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return usersList;
    }

    @Override
    public List<Users> sortByName(String sortOption) {
        List<Users> userList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement("select * from users order by name_user " + sortOption + ";");
            resultSet = statement.executeQuery();
            Users user;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name_user");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new Users(id, name, email, country);
                userList.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert resultSet != null;
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return userList;
    }
}

