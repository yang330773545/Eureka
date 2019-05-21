package com.vinzor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//启动zuul服务网关
@EnableZuulProxy
@SpringBootApplication
public class ZuulFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulFirstApplication.class, args);
	}

}
