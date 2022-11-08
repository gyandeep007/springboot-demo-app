package com.gyan.springbootdemoapp.service;


import com.gyan.springbootdemoapp.entities.Product;
import com.gyan.springbootdemoapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
    ProductRepository productRepository;


    public List<Product> getAllProduct(){
      return   productRepository.getAllProduct();
    }

    public Product getProductById(int id){
        return productRepository.getProductById(id);
    }

    public void addProduct(Product product){
        productRepository.addProduct(product);
    }

    public void deleteProduct(int id){
        productRepository.deleteProduct(id);
    }
}
