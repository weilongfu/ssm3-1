package com.newer.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.UserDao;
import com.newer.domian.User;
import com.newer.dto.PageDto;
import com.newer.service.UserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public PageInfo<User> findPage(PageDto pageDto) {
		//分页
		PageHelper.startPage(pageDto.getPage(),pageDto.getPageSize());
		
		List<User> list=userDao.selectAll();
		
		PageInfo<User> pageinfo=new PageInfo<User>(list);
		return pageinfo;
	}

	//添加
	public String add(User user) {
		
		int num=this.userDao.insert(user);
		if(num>0) {
			return "添加成功!";
		}
		return "添加失败!";
	}

	//查询
	@Override
	public User select(User user) {
		Example example=new Example(user.getClass());
		Criteria criteria=example.createCriteria();
		criteria.andEqualTo("name", user.getName());
		criteria.andEqualTo("pwd", user.getPwd());
		User use=this.userDao.selectOneByExample(example);
		
		return use;
	}
}
