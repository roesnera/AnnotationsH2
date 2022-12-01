package com.example.annotationsh2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> getAll(){
        return personRepository.findAll();
    }

    public void addPerson(Person person){
        personRepository.save(person);
    }
}
