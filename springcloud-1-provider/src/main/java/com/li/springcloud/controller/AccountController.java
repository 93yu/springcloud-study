package com.li.springcloud.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.li.springcloud.mapper.UserMapper;
import com.li.springcloud.pojo.Account;
import com.li.springcloud.service.AccountService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController// responseBody+controller
public class AccountController {
	@Autowired
	private AccountService uService;
	

	@RequestMapping("/findAll")
	@HystrixCommand(fallbackMethod="hystrix_findAll")
	public List<Account> findAll() {
		//throw new RuntimeException();
		return uService.findAll();
	};
	 
	public List<Account> hystrix_findAll(){
		ArrayList<Account> list = new ArrayList<>();
		Account account = new Account();
		account.setId("22");
		account.setName("查找所有错误");
		list.add(account);
		return list;
	};
}
