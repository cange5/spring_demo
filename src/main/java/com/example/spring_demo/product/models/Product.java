package com.example.spring_demo.product.models;


import lombok.Getter;


@Getter
public class Product {
    String name;
    String description;
    int price;

    public Product(String name, String description, int price){
        this.name=name;
        this.description=description;
        this.price=price;
    }



}
