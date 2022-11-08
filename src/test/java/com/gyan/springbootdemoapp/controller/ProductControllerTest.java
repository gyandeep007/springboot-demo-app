package com.gyan.springbootdemoapp.controller;

import com.gyan.springbootdemoapp.entities.Product;
import com.gyan.springbootdemoapp.service.ProductService;
import com.gyan.springbootdemoapp.utility.DataUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductService productService;


    @Test
    @DisplayName("testing success scenario for getting all products")
    void productList() {
        int count = 5;
        Mockito.when(productService.getAllProduct()).thenReturn(DataUtil.getAllProduct());
        List<Product> product= productController.productList();
        Assertions.assertEquals(count,product.size());
    }

    @Test
    void getProductById() {
    }

    @Test
    void addProduct() {
    }

    @Test
    void deleteProductById() {
    }

    @ParameterizedTest
    @ValueSource(strings = {"cali","bali","dani"})
    void testEndWithI(String str){
        assertTrue(str.endsWith("i"));
    }
}
