package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZipkinProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinProducerApplication.class, args);
	}

}
