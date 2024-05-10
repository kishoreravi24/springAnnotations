package com.spring.annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spring.annotations.controller.PizzaController;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(AnnotationsApplication.class, args);
		PizzaController pizzaController = context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());
	}

}
