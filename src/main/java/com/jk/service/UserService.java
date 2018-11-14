/** 
 * <pre>项目名称:mybatis-spring-boot 
 * 文件名称:UserService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年11月12日下午3:30:27 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jk.model.UserBean;


public interface UserService {

	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：赵展彬  
	 * 创建时间：2018年11月12日 下午3:48:28    
	 * 修改人：赵展彬  
	 * 修改时间：2018年11月12日 下午3:48:28    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<UserBean> queryUser();

	/** <pre>toadduser(这里用一句话描述这个方法的作用)   
	 * 创建人：赵展彬  
	 * 创建时间：2018年11月12日 下午6:59:52    
	 * 修改人：赵展彬
	 * 修改时间：2018年11月12日 下午6:59:52    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	void toadduser(UserBean user);

	/** <pre>todelete(这里用一句话描述这个方法的作用)   
	 * 创建人：赵展彬  
	 * 创建时间：2018年11月12日 下午8:59:32    
	 * 修改人：赵展彬
	 * 修改时间：2018年11月12日 下午8:59:32    
	 * 修改备注： 
	 * @param id</pre>    
	 */
	void todelete(Integer id);

	/** <pre>toMainbyid(这里用一句话描述这个方法的作用)   
	 * 创建人：赵展彬  
	 * 创建时间：2018年11月12日 下午9:31:34    
	 * 修改人：赵展彬
	 * 修改时间：2018年11月12日 下午9:31:34    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	UserBean toMainbyid(Integer id);
	
	
}
