package com.samuel.veebipood.controller;

import com.samuel.veebipood.entity.Adress;
import com.samuel.veebipood.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AdressController {

    @Autowired
    private AdressRepository adressRepository;

    @GetMapping("adresses")
    public List<Adress> getAdress(){
        return adressRepository.findAll();
    }

    @GetMapping("adresses/{id}")
    public List<Adress> deleteAdress(@PathVariable Long id){
        adressRepository.deleteById(id);
        return adressRepository.findAll();
    }

    @PostMapping("adresses")
    public List<Adress> addAdress(@RequestBody Adress adress){
        adressRepository.save(adress);
        return adressRepository.findAll();
    }
}


