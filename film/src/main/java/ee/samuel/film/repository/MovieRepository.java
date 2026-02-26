package ee.samuel.film.repository;

import ee.samuel.film.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Film, Long> {


}