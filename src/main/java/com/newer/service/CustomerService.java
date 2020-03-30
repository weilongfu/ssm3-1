package com.newer.service;

import com.github.pagehelper.PageInfo;
import com.newer.domian.Customer;
import com.newer.dto.PageDto;

public interface CustomerService {
  
	//带条件分页查询
	public PageInfo<Customer> findPage(PageDto pageDto);
	
	//添加
	public int add(Customer customer);
}
