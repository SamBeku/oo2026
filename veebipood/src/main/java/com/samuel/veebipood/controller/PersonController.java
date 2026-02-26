package com.samuel.veebipood.controller;

import com.samuel.veebipood.entity.Person;
import com.samuel.veebipood.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("categories")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    @GetMapping("categories/{id}")
    public List<Person> deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return personRepository.findAll();
    }

    @PostMapping("categories")
    public List<Person> addPerson(@RequestBody Person person){
        personRepository.save(person);
        return personRepository.findAll();
    }
}

