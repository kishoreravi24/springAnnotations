package com.spring.annotations.controller;

import com.spring.annotations.service.Pizza;
import com.spring.annotations.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

//    @Autowired
//    private PizzaService pizzaService;

    private Pizza vegPizza;
    private Pizza nonVegPizza;

    @Autowired
    public PizzaController(@Qualifier("pizzaService") Pizza vegPizza, @Qualifier("nonvegPizza") Pizza nonvegPizza){
        this.vegPizza = vegPizza;
        this.nonVegPizza = nonvegPizza;
    }

//    private PizzaService pizzaService;
//    @Autowired
//    public void setPizza(PizzaService pizzaService){
//        this.pizzaService = pizzaService;
//    }

    public String getPizza(){
        return vegPizza.getPizza()+" "+nonVegPizza.getPizza();
    }
}
