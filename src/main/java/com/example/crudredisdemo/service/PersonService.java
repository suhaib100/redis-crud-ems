package com.example.crudredisdemo.service;

import com.example.crudredisdemo.entity.Person;
import com.example.crudredisdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person findById(String id) {
        return personRepository.findById(id).orElse(null);
    }

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public void deleteById(String id) {
        personRepository.deleteById(id);
    }

    public Person update(String id, Person updatedPerson) {
        Person existingPerson = findById(id);
        if (existingPerson != null) {
            existingPerson.setName(updatedPerson.getName());
            existingPerson.setAge(updatedPerson.getAge());
            return save(existingPerson);
        }
        return null;
    }
}
