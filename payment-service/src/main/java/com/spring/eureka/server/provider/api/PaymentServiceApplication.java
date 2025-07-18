package com.spring.eureka.server.provider.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
/*
 * The @EnableEurekaClient annotation was deprecated and removed in newer
 * versions of Spring Cloud (specifically, Spring Cloud Netflix 3.x and later,
 * which aligns with your Spring Cloud 2025.0.0 and Spring Boot 3.x versions).
 * In Spring Boot 3.x and Spring Cloud 2025.0.0 (and later), you no longer need
 * a specific annotation like @EnableEurekaClient to enable Eureka client
 * functionality. Simply having the spring-cloud-starter-netflix-eureka-client
 * dependency in your pom.xml is enough. Spring Boot's autoconfiguration will
 * automatically configure your application as a Eureka client.
 */
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
