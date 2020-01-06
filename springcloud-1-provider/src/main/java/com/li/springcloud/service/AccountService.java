package com.li.springcloud.service;

import java.util.List;

import com.li.springcloud.pojo.Account;

public interface AccountService {
	List<Account> findAll();
}
