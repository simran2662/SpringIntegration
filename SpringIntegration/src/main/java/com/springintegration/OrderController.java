package com.springintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RequestMapping("/api")
public class OrderController {
     
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/placeorder")
	public void placeOrder(@RequestBody Order order) {
		orderService.placeOrder(order);
	}
}
