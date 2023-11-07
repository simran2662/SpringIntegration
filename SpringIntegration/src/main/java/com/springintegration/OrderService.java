package com.springintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
@Service
public class OrderService {
	
	@Autowired
	public MessageChannel newOrderChannel;
	
	@Autowired
	public MessageChannel processingChannel;
	
	@Autowired
	public MessageChannel shippedChannel;
	
	public void placeOrder(Order order) {
		Message<Order> message = MessageBuilder.withPayload(order).build();
		newOrderChannel.send(message);
	}
	
	
	@ServiceActivator(inputChannel = "newOrderChannel")
	public void processOrder(Message<Order> message) {
		Order order = message.getPayload();
		order.setStatus("Processing");
		processingChannel.send(message);
	}
	
	@ServiceActivator(inputChannel = "processingChannel")
	public void shipOrder(Message<Order> message) {
		Order order = message.getPayload();
		order.setStatus("shipped");
		shippedChannel.send(message);
	}

}
