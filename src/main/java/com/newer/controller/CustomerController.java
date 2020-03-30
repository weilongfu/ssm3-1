package com.newer.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.newer.domian.Customer;
import com.newer.dto.PageDto;
import com.newer.service.CustomerService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
   
	@RequestMapping("/findPage")
	//带条件分页查询
	public PageInfo<Customer> findPage(@RequestBody PageDto pageDto){
		PageInfo<Customer> pageinfo=customerService.findPage(pageDto);
		return pageinfo;
	}
	
	@RequestMapping("/add")
	public String add(@RequestBody Customer customer) {
		int num=customerService.add(customer);
		if(num>0) {
			return "添加成功！";
		}
		return "添加失败！";
	}
	
	@RequestMapping("/add2")
	public String add2(Customer customer, MultipartFile  img,HttpSession session) throws IllegalStateException, IOException {
		if(img!=null && !"".equals(img.getOriginalFilename())) {
			 
			String oldName=img.getOriginalFilename();
			 
			String ext=oldName.substring(oldName.lastIndexOf("."));
		 
			String newName=UUID.randomUUID()+ext;
			 
			String realpath= session.getServletContext().getRealPath("upload")+"/"+newName;
		 
			img.transferTo(new File(realpath));
			
		 
			customer.setPhoto(newName);
		}
		
		int num=customerService.add(customer);
		
		if(num>0) {
			return "添加成功！";
		}
		return "添加失败！";
	}
}
