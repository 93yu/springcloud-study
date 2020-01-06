package com.li.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.li.springcloud.factory.AccountFallBackFactory;
import com.li.springcloud.pojo.Account;
//value 指定分布式访问的服务器名字，fallbackfactory表示访问错误时返回的数据结构

@FeignClient(value="provider",fallbackFactory=AccountFallBackFactory.class)
public interface AccountService {
	@RequestMapping("/findAll")
	List<Account> findAll();
}
