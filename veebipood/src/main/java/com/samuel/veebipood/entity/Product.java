package com.samuel.veebipood.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Boolean active;
    private int stock;
    //Andmebaasi, aga ei määra seda väärtust
    //double -> 0
    //boolean -> False
    //int-> 0

    //Andmebaasi, aga ei määra seda väärtust
    //Double -> null
    //Boolean -> null
    //Integer-> null
}
