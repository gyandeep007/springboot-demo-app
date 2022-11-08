package com.gyan.springbootdemoapp.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("this is called first and one time");
    }

    @BeforeEach//run before each test method
    void setUp() {
        System.out.println("Before each");
         greeting = new Greeting();
    }

    @Test
    void helloWorld() {

        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() { Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld("gyandeep"));
    }

    @AfterEach// runs after each test method
    void tearDown() {
        System.out.println("In after each");
    }

    @AfterAll
    public static void inTheEnd(){
        System.out.println("this is called at the end and one time");
    }
}
