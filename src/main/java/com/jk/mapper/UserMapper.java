/** 
 * <pre>项目名称:mybatis-spring-boot 
 * 文件名称:UserMapper.java 
 * 包名:com.jk.mapper 
 * 创建日期:2018年11月12日下午3:02:00 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jk.model.UserBean;
@Mapper
public interface UserMapper{
	
	
	@ResultType(com.jk.model.UserBean.class)
	@Select(value="<script>"+
    "select  *   from  t_users  "
    + "</script>")
	List<UserBean> queryUser();

	/** <pre>toadduser(这里用一句话描述这个方法的作用)   
	 * 创建人：赵展彬  
	 * 创建时间：2018年11月12日 下午7:11:31    
	 * 修改人：赵展彬
	 * 修改时间：2018年11月12日 下午7:11:31    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	@Insert(" insert into t_users (name,sex) "
			+ " values(#{name},#{sex})")
	void toadduser(UserBean user);

	/** <pre>todelete(这里用一句话描述这个方法的作用)   
	 * 创建人：赵展彬  
	 * 创建时间：2018年11月12日 下午9:00:04    
	 * 修改人：赵展彬
	 * 修改时间：2018年11月12日 下午9:00:04    
	 * 修改备注： 
	 * @param id</pre>    
	 */

	@Delete(" delete from t_users where id=#{id} ")
	void todelete(Integer id);

	/** <pre>toMainbyid(这里用一句话描述这个方法的作用)   
	 * 创建人：赵展彬  
	 * 创建时间：2018年11月12日 下午9:32:17    
	 * 修改人：赵展彬
	 * 修改时间：2018年11月12日 下午9:32:17    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	@Select("select  *   from  t_users where id=#{id}")
	UserBean toMainbyid(Integer id);

	/** <pre>toupdate(这里用一句话描述这个方法的作用)   
	 * 创建人：赵展彬  
	 * 创建时间：2018年11月13日 下午2:19:58    
	 * 修改人：赵展彬
	 * 修改时间：2018年11月13日 下午2:19:58    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	@Update(" update t_users set "
			+ " name = #{name}, "
			+ " sex = #{sex} "
			+ " where id = #{id}")
	void toupdate(UserBean user);
	
	
}
