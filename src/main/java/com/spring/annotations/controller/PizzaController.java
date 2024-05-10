package com.spring.annotations.controller;

import com.spring.annotations.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

//    private PizzaService pizzaService;
//    @Autowired
//    public PizzaController(PizzaService pizzaService){
//        this.pizzaService = pizzaService;
//    }

//    private PizzaService pizzaService;
//    @Autowired
//    public void setPizza(PizzaService pizzaService){
//        this.pizzaService = pizzaService;
//    }

    public String getPizza(){
        return pizzaService.getPizza();
    }
}
