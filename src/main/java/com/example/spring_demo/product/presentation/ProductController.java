package com.example.spring_demo.product.presentation;

import com.example.spring_demo.product.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts(){
        return List.of(
                new Product("P1", "D1", 10),
                new Product("P2", "D2", 20),
                new Product("P3", "D3", 30)
        );
    }


}
