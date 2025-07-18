package com.spring.eureka.server.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/amazon-payment/{price}")
	public String invokePaymentService(@PathVariable int  price) {
// below url is the traditional way to invoke the api like before the eureka service
		//		String url = "http://localhost:8888/payment-provider/payNow/"+price;
		String url = "http://PAYMENT-SERVICE/payment-provider/payNow/"+price;
		return  restTemplate.getForObject(url, String.class);
	}
}
