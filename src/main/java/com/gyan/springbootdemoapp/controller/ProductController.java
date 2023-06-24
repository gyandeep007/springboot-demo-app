package com.gyan.springbootdemoapp.controller;


import com.gyan.springbootdemoapp.entities.Product;
import com.gyan.springbootdemoapp.ruleengine.Validator;
import com.gyan.springbootdemoapp.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    @Autowired
    Validator validator;
    @GetMapping
    public List<Product> productList(){
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") int id){
        return productService.getProductById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") int id){
        productService.deleteProduct(id);
    }

    @GetMapping("/validate")
    public void validate(){
        validator.validate();
    }
}
