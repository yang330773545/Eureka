package com.vinzor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vinzor.filter.MyFilter;

@SpringBootApplication
public class ZuulFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulFilterApplication.class, args);
	}
	
	@Bean
	public MyFilter tokenFilter() {
		return new MyFilter();
	}
}
