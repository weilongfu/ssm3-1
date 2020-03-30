package com.newer.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.newer.domian.User;
import com.newer.dto.PageDto;
import com.newer.service.UserService;
import com.newer.util.MyConstants;

@RestController
@RequestMapping("/user")
@SessionAttributes(MyConstants.SESSSION_USER)
public class Usercontroller {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findPage")
	public PageInfo<User> findPage(@RequestBody PageDto pageDto) {
		PageInfo<User>  pageinfo=userService.findPage(pageDto);
		return pageinfo;
	}
	
	@RequestMapping("/add")
	public String add(@RequestBody User user) {
		String msg=userService.add(user);
		return msg;
	}
	
	@RequestMapping("/select")
	public User select(@RequestBody User user,Model model,HttpSession session) {
		System.out.println(user);
		User use=userService.select(user);
		if (user!=null) {
			model.addAttribute(MyConstants.SESSSION_USER,user);
		} 
		if(use!=null) {
			return use;
		}
		return null;
	}
}
