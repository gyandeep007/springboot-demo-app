package com.gyan.springbootdemoapp.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.gyan.springbootdemoapp.exception.*;

class ItemControllerTest {

    ItemController controller;

    @BeforeEach
    void setUp() {
        controller = new ItemController();
    }

    @Test
    void index() {
        assertEquals("index",controller.index());
    }

    @Test
    void oopsHandler() {
        assertThrows(ValueNotFoundException.class,()->{
            controller.oopsHandler();
        });
    }
}
