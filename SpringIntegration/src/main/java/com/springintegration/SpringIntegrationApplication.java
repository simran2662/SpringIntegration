package com.springintegration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@ComponentScan(basePackages = "com.springintegration")
@Configuration
@EnableIntegration
public class SpringIntegrationApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		System.out.println("application is running.....");
	
	
	Order order = new Order();
	order.setOrderNumber("123");
	order.setCustomerName("Riya");
	order.setStatus("shipped");
	
	List<OrderItem> items = new ArrayList();
	 OrderItem item1 = new OrderItem();
	 item1.setProductName("Product A");
	 item1.setQuantity(1);
	 item1.setPrice(250.0);
	  
	 OrderItem item2 = new OrderItem();
	 item2.setProductName("Product B");
	 item2.setQuantity(1);
	 item2.setPrice(29.99);
	 
	 items.add(item1);
	 items.add(item2);
	 
	 order.setItems(items);
	 
	 
	 System.out.print(order);
	 
	 
	 
	}
}



