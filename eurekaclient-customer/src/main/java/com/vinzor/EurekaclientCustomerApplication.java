package com.vinzor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;




@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker


public class EurekaclientCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientCustomerApplication.class, args);
	}

}
