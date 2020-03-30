package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.CustomerDao;
import com.newer.domian.Customer;
import com.newer.dto.PageDto;
import com.newer.service.CustomerService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao customerDao;

	@Override
	public PageInfo<Customer> findPage(PageDto pageDto) {
		
		Example example=new Example(Customer.class);
		
		Criteria criteria=example.createCriteria();
		if(pageDto.getKey()==null) {
			pageDto.setKey("");
		}
		criteria.andLike("custname", "%"+pageDto.getKey()+"%");
		
		PageHelper.startPage(pageDto.getPage(), pageDto.getPageSize());
		List<Customer> list=customerDao.selectByExample(example);
		
		PageInfo<Customer> pageinfo=new PageInfo<Customer>(list);
		
		return pageinfo;
	}

	@Override
	public int add(Customer customer) {
		int num=customerDao.insert(customer);
		return num;
	}

}
