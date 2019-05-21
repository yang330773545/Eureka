package com.vinzor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * 
 * @author woshishui
 * 	server端会自动读取最新提交的内容
 *	仓库中的配置文件会被转换成web接口，访问可以参照以下的规则：
 *	/{application}/{profile}[/{label}]
 *	/{application}-{profile}.yml
 *	/{label}/{application}-{profile}.yml
 *	/{application}-{profile}.properties
 *	/{label}/{application}-{profile}.properties
 *	以neo-config-dev.properties为例子，它的application是
 *	neo-config，profile是dev。client会根据填写的参数来选择读取对应的配置。
 */
//可以再启动一个server端来做服务的负载，提供高可用的server端支持
//注册入注册中心
@EnableDiscoveryClient
//表示为server
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
