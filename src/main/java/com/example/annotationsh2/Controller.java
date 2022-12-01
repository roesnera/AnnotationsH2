package com.example.annotationsh2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    PersonService personService;

    public Controller( PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> getPeople(){
        return personService.getAll();
    }

    @PostMapping("/")
    public void addPerson(@RequestBody PersonRequest person){
        Person newPerson = new Person();
        newPerson.setName(person.name());
        newPerson.setFavColor(person.favColor());
        personService.addPerson(newPerson);
    }
}
