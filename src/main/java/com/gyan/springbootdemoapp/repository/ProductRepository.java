package com.gyan.springbootdemoapp.repository;


import com.gyan.springbootdemoapp.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository {

    static Map<Integer, Product> productMap = new HashMap<>();
    static {
        productMap.put(1,new Product(1,"mobile",30000));
        productMap.put(2,new Product(2,"laptop",15000));
        productMap.put(3,new Product(3,"desktop",6000));
        productMap.put(4,new Product(4,"keyboard",1300));
        productMap.put(5,new Product(5,"mouse",500));
    }



    public Product getProductById(int id){
        return productMap.get(id);
    }

    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<>(productMap.values());


        return products;
    }

    public void addProduct(Product product){
        productMap.put(product.getProductID(), product);
    }

    public void deleteProduct(int productId){
        productMap.remove(productId);
    }
}
