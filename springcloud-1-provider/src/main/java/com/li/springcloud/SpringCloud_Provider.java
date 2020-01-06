package com.li.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
@SpringBootApplication
@MapperScan("com.li.springcloud.mapper")
@EnableEurekaClient//将服务注册到 eureka端 ，进行管理
@EnableHystrix //启动短路器机制
public class SpringCloud_Provider {
	public static void main(String[] args) {
			SpringApplication.run(SpringCloud_Provider.class, args);
	} 
}
