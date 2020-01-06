package com.li.springcloud.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)//是否使用链式加载
@TableName("account")
public class Account {
	@TableId(type=IdType.INPUT)
	private String id;
	private String name;
	private int money;
}
