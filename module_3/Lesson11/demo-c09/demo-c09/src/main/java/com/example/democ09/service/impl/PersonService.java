package com.example.democ09.service.impl;

import com.example.democ09.model.Person;
import com.example.democ09.repository.IPersonRepository;
import com.example.democ09.repository.impl.PersonRepository;
import com.example.democ09.service.IPersonService;

import java.util.List;

public class PersonService implements IPersonService {

    private IPersonRepository personRepository = new PersonRepository();

    @Override
    public List<Person> findAll() {
        return this.personRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        this.personRepository.deleteById(id);
    }

    @Override
    public Person findById(int id) {
        return this.personRepository.findById(id);
    }

    @Override
    public void updatePerson(Person person) {
        this.personRepository.updatePerson(person);
    }
}
