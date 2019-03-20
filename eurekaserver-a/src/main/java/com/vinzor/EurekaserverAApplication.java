package com.vinzor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverAApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverAApplication.class, args);
	}

}
