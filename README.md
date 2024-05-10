# Spring Annotaions

### Controller
@**Controller** = It indicates that the class is responsible for handling incoming HTTP 
requests.

### RestController
@**RestController** = controller + ResponseBody.

### Component
@**Component**  = This indicates the class is a “Spring bean/Component” or Tells spring container to automatically create spring bean and manages it. ( no need to create object for the class with new keyword, spring automatically creates bean for it)

- Example

```jsx
@Component
public class Pizza {
	public String getPizza(){
		return "hello pizza";
	}
}

@SpringBootApplication
public class Main {
	public static void main(String[] args){
		SpringApplication.run(Main.class,args);
	}
}
```

- Run method returns the application context object i.e application context acts as a spring IOC container and the component creates the spring bean for the pizza class and that bean is already in the IOC container.
- Get pizza bean

```jsx
@SpringBootApplication
public class Main {
	public static void main(String[] args){
		var context = SpringApplication.run(Main.class,args);
		Pizza pizza = context.getBean(Pizza.class);
		System.out.println(pizza.getPizza());
	}
}
```

- we can provide specific bean name, @Component(pizzaDemo);

### Autowired
@**Autowired** = This annotation is used to inject the bean automatically.

- Instead of creating object for ourself by adding new keyword. with component we can create the bean and with the Autowired we can initialize the bean automatically.
- Check PizzaController class file for three different way to have the Autowired annotations i.e Constructor based, setter, and annotations based.


