package com.li.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//启动时不加载数据源配置
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableEurekaServer //启动Eureka配置
public class SpringCloud_Eureka {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloud_Eureka.class, args);
	}
}
