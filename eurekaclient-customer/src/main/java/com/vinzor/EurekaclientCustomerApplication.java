package com.vinzor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;



//启用服务注册与发现
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients
@SpringBootApplication
//启用Hystrix Dashboard(监控熔断用)和熔断器
@EnableHystrixDashboard
@EnableCircuitBreaker


public class EurekaclientCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientCustomerApplication.class, args);
	}

}
