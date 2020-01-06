package com.li.springcloud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.li.springcloud.pojo.Account;
import com.li.springcloud.service.AccountService;
@RestController// responseBody+controller
public class AccountController {
	//用fiegn实现，内部自己负载均衡
	@Autowired
	private AccountService accountService;
	@RequestMapping("/findAll")
	private List<Account> findAll() {
		
		return accountService.findAll();
	}
	
	
	
	//----------------------------------------------------
	//private static final String provider_url="http://localhost:8100";
	/*private static final String provider_url="http://provider";
	//SpringCloud 基于http协议 -Rest结构
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/findAll")
	private List<Account> findAll() {
		return restTemplate.getForObject(provider_url+"/findAll",List.class);
	};*/
	

}
