package com.example.spring_demo.product.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;//@ vuol dire che gli attribuiamo una colonna
    private String name;
    private String description;
    private int price;
    private String category;
    private LocalDate expiryDate;
    @Transient
    private int daysToExpire;

}
