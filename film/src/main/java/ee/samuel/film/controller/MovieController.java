package ee.samuel.film.controller;

import ee.samuel.film.entity.Film;
import ee.samuel.film.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MovieController {


    @Autowired
    private MovieRepository MovieRepository;

    //filmide leidmine andmebaasist
    @GetMapping("film")
    public List<Film> getMovie() {
        return MovieRepository.findAll();
    }

    //filmide kustutamine andmebaasist
    @DeleteMapping("film/{id}")
    public List<Film> deleteMovie(@PathVariable Long id) {
        MovieRepository.deleteById(id); //siin kustutab
        return MovieRepository.findAll(); //tagastab koik alles jaanud filmid andmebaasist
    }

    //filmide uleslaadimine andmebaasi
    @PostMapping("film")
    public List<Film> addMovie(@RequestBody Film movie) {
        MovieRepository.save(movie); //siin salvestab
        return MovieRepository.findAll(); //tagastab koik filmid andmebaasis
    }
}

