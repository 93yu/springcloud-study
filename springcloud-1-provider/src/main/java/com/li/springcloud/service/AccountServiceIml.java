package com.li.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.li.springcloud.mapper.UserMapper;
import com.li.springcloud.pojo.Account;

@Service
public class AccountServiceIml implements AccountService {
	@Autowired
	private UserMapper userMapper;

	public List<Account> findAll() {
		return userMapper.selectList(null);
	}

}
