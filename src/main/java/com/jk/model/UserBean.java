/** 
 * <pre>项目名称:mybatis-spring-boot 
 * 文件名称:UserBean.java 
 * 包名:tk.mybatis.springboot.model 
 * 创建日期:2018年11月12日下午2:53:13 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

public class UserBean {
	
	private Integer id;
	private String name;
	private String sex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
}
