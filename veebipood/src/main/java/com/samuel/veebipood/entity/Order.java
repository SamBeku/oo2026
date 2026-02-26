package com.samuel.veebipood.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.datetime.DateFormatterRegistrar;

import java.sql.Date;

public class Order {@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private Date created;
    private int total;
}
