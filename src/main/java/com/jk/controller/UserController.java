package com.jk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jk.model.Customer;
import com.jk.model.UserBean;
import com.jk.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
    MongoTemplate mongoTemplate;
	
	@RequestMapping("toMain")
	 @ResponseBody
	public String toMain(ModelMap map){
		List<UserBean> user = userService.queryUser();
		map.put("data", user);
		return "view";
	}
	//保存
	@RequestMapping("toadduser")
	public ModelAndView toadduser(UserBean user){
		ModelAndView result = new ModelAndView("redirect:/user/toMain");
		userService.toadduser(user);
		return result;
	}
	//新增
	@RequestMapping("tosave")
	public String tosave(){
		
		return "adduser";
	}
	//删除
	@RequestMapping("/todelete/{id}")
	public ModelAndView todelete(@PathVariable Integer id, RedirectAttributes ra){
		 ModelAndView result = new ModelAndView("redirect:/user/toMain");
		userService.todelete(id);
		  ra.addFlashAttribute("msg", "删除成功!");
		return result;
	}
	//修改 查询
	@RequestMapping("toMainbyid/{id}")
	
	public String  toMainbyid(Model m,@PathVariable Integer id){
		UserBean user = userService.toMainbyid(id);
		m.addAttribute("data", user);
		return "updateuser";
	}
	
	//mogodb查询
	@RequestMapping("/list")
	@ResponseBody
    public List<Customer> dobegin() throws Exception {
     List<Customer> list =  mongoTemplate.findAll(Customer.class);//也可以
        return list;
    }
	//mogodb新增
	@RequestMapping("addCustomer")
    @ResponseBody
    public Boolean addCustomer(Customer customer){
		try {
			customer.setCarName("陈佳乐");
			customer.setCarNumber("111");
			mongoTemplate.save(customer, "customer");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	//mogodb删除	
		@RequestMapping("deletemg")
	    @ResponseBody
	    public void deletemg(Customer customer) {
			Query query=new Query(Criteria.where("_id").is("5beace18e97f9841145eac10"));
			mongoTemplate.remove(query,"customer");
		}
		//mogod修改
		@RequestMapping("updatemg")
	    @ResponseBody
	    public void updatemg(Customer customer) {
			Update update = new Update();   
			update.set("carName", "乐乐2");
			update.set("carNumber","666");
			mongoTemplate.updateFirst(new Query(Criteria.where("5beace18e97f9841145eac10").is(customer.get_id())), update, Customer.class);


		}
	
}
