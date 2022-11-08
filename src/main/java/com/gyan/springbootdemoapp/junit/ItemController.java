package com.gyan.springbootdemoapp.junit;

import com.gyan.springbootdemoapp.exception.*;

public class ItemController {

    public String index(){
        return "index";
    }

    public String oopsHandler() {
       throw new ValueNotFoundException();
    }
}
