package com.example.clothes.controller;

import com.example.clothes.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1L,"T-Shirt",10,100));
        products.add(new Product(2L,"Jeans",25,50));
        products.add(new Product(3L,"Jacket",40,30));
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
}