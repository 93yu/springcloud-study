package com.li.springcloud.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.li.springcloud.pojo.Account;
import com.li.springcloud.service.AccountService;

import feign.hystrix.FallbackFactory;
//表示对accountservice的熔断，不用等待错误
@Component  //实列化注解
public class AccountFallBackFactory  implements FallbackFactory<AccountService>{

	@Override
	public AccountService create(Throwable cause) {
		
		return new AccountService() {
			
			@Override
			public List<Account> findAll() {
				ArrayList<Account> list = new ArrayList<>();
				Account account = new Account();
				account.setId("22");
				account.setName("客户端服务器降级熔断");
				list.add(account);
				return list;
			}
		};
	}
	

}
