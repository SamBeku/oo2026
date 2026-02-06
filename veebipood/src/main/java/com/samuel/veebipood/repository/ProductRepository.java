package com.samuel.veebipood.repository;

import com.samuel.veebipood.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//repository -> AB suhtlemiseks, sisaldab funktsioone, mida on võimalik AB-ga teha

public interface ProductRepository extends JpaRepository<Product, Long> {


    Long id(Long id);
}
