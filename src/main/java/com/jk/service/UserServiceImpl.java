/** 
 * <pre>项目名称:mybatis-spring-boot 
 * 文件名称:UserServiceImpl.java 
 * 包名:com.jk.service 
 * 创建日期:2018年11月12日下午3:31:27 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.mapper.UserMapper;
import com.jk.model.UserBean;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<UserBean> queryUser() {
		return userMapper.queryUser();
	}
	
	public void toadduser(UserBean user) {
		if(user.getId()!=null&&user.getId()!=0){
			userMapper.toupdate(user);
		}else{
			userMapper.toadduser(user);
		}
		
	}
	public void todelete(Integer id) {
		userMapper.todelete(id);
	}
	public UserBean toMainbyid(Integer id) {
	
		return 	userMapper.toMainbyid(id);
	}
		
}
