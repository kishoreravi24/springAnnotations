package com.spring.annotations.service;

import org.springframework.stereotype.Component;

@Component
public class PizzaService implements Pizza{

    @Override
    public String getPizza(){
        return "hello, veg pizza";
    }
}
