package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  由于gateway使用webflux和netty pom中没有web模块
 * @author 50000008
 *
 */
@SpringBootApplication
public class SpringcloudgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudgatewayApplication.class, args);
	}

}
