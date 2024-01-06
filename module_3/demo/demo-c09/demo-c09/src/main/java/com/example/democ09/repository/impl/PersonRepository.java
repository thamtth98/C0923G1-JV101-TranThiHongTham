package com.example.democ09.repository.impl;

import com.example.democ09.model.Person;
import com.example.democ09.repository.DBConnect;
import com.example.democ09.repository.IPersonRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepository {

    private final String SELECT_ALL_PERSONS = " SELECT * FROM persons ";

    @Override
    public List<Person> findAll() {
        List<Person> personList = new ArrayList<>();
        Connection connection = DBConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PERSONS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int personId = resultSet.getInt("person_id");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String address = resultSet.getString("address");
                String city = resultSet.getString("city");
                Person person = new Person(personId, lastName, firstName, address, city);
                personList.add(person);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return personList;
    }
    private final String DELETE_BY_ID = " DELETE FROM `persons` WHERE (`person_id` = ?) ";
    @Override
    public void deleteById(int id) {
        Connection connection = DBConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private final String FIND_BY_ID = " SELECT * FROM persons where person_id = ? ";
    @Override
    public Person findById(int id) {
        Person person = null;
        Connection connection = DBConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int personId = resultSet.getInt("person_id");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String address = resultSet.getString("address");
                String city = resultSet.getString("city");
                person = new Person(personId, lastName, firstName, address, city);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return person;
    }

    private final String UPDATE_PERSON = " UPDATE `persons` " +
            " SET `last_name` = ?, `first_name` = ?, `address` = ?, `city` = ? WHERE (`person_id` = ?); ";

    @Override
    public void updatePerson(Person person) {
        Connection connection = DBConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PERSON);
            preparedStatement.setString(1, person.getLastName());
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setString(3, person.getAddress());
            preparedStatement.setString(4, person.getCity());
            preparedStatement.setInt(5, person.getPersonId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
