package com.spring.eureka.server.provider.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

	@GetMapping("/payNow/{price}")
	public String payNow(@PathVariable int price) {
		return "Payment with " + price + " is Successful";
	}
}
