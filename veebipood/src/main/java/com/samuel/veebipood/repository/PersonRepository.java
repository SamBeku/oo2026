package com.samuel.veebipood.repository;

import com.samuel.veebipood.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
