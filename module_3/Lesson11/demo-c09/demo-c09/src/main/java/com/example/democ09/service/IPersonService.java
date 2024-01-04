package com.example.democ09.service;

import com.example.democ09.model.Person;

import java.util.List;

public interface IPersonService {
    List<Person> findAll();

    void deleteById(int id);

    Person findById(int id);

    void updatePerson(Person person);
}
