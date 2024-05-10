package com.spring.annotations.service;

import org.springframework.stereotype.Component;

@Component
public class PizzaService {
    public String getPizza(){
        return "hello, pizza";
    }
}
