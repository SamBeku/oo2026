package com.samuel.veebipood.controller;

import com.samuel.veebipood.entity.Category;
import com.samuel.veebipood.entity.Product;
import com.samuel.veebipood.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("categories")
    public List<Category> getCategory(){
        return categoryRepository.findAll();
    }

    @GetMapping("categories/{id}")
    public List<Category> deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
        return categoryRepository.findAll();
    }

    @PostMapping("categories")
    public List<Category> addCategory(@RequestBody Category category){
        categoryRepository.save(category);
        return categoryRepository.findAll();
    }
}


