package com.spring.annotations.service;

import org.springframework.stereotype.Component;

@Component
public class NonvegPizza implements Pizza{
    @Override
    public String getPizza(){
        return "Non veg Pizza";
    }
}
