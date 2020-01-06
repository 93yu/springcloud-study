package com.li.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
@Configuration
public class RestTemplateConfig {
	@Bean 
	@LoadBalanced    //如果用cloud 调用服务端程序，需要指定方式
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public IRule myRule() {
		return new RoundRobinRule(); //轮询
	//	return new RandomRule(); //轮询
	//	return new AvailabilityFilteringRule(); //过滤障碍机或者并发数超过阈值的服务器。剩余的轮询
		//return new BestAvailableRule(); //过滤障碍机,选择最小的并发服务器
	}
	
}
