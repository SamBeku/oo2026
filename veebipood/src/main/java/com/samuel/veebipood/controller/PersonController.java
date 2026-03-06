package com.samuel.veebipood.controller;

import com.samuel.veebipood.entity.Person;
import com.samuel.veebipood.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("persons")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    @GetMapping("persons/{id}")
    public List<Person> deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return personRepository.findAll();
    }

    @PostMapping("persons")
    public List<Person> addPerson(@RequestBody Person person){
        personRepository.save(person);
        return personRepository.findAll();
    }
}

