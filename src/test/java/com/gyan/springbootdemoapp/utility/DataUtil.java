package com.gyan.springbootdemoapp.utility;

import com.gyan.springbootdemoapp.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static List<Product> getAllProduct(){
        List<Product> products = new ArrayList<>();
      Product p1=  new Product(1,"mobile",30000);
      Product p2=  new Product(2,"laptop",15000);
      Product p3=  new Product(3,"desktop",6000);
      Product p4=  new Product(4,"keyboard",1300);
      Product p5=  new Product(5,"mouse",500);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        return products;
    }
}
