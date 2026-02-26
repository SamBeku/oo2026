package com.samuel.veebipood.repository;

import com.samuel.veebipood.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
