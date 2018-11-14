/** 
 * <pre>项目名称:StringBoot-dubbo-provider1 
 * 文件名称:Customer.java 
 * 包名:com.jk.model 
 * 创建日期:2018年11月13日下午8:21:46 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * <pre>项目名称：boot_dubbo_provider    
 * 类名称：Customer    
 * 类描述：    
 * 创建人：周海洋 
 * 创建时间：2018年11月13日 下午9:09:27    
 * 修改人：周海洋 
 * 修改时间：2018年11月13日 下午9:09:27    
 * 修改备注：       
 * @version </pre>
 */
@Document(collection="customer")
public class Customer {
	
	
	private String _id;
    private String carName;
    private String carNumber;
   
    
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
    
    
}
