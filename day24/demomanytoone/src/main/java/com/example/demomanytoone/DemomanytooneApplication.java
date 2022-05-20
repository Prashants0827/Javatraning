package com.example.demomanytoone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemomanytooneApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(DemomanytooneApplication.class, args);
		CartRepository cart=context.getBean(CartRepository.class);
		
		ItemsRepository items = context.getBean(ItemsRepository.class);
		Cart r1=new Cart(1,"abc");
		cart.save(r1);
		Items e1=new Items(100,"mouse",200,r1);
		items.save(e1);
		
				
	}

}