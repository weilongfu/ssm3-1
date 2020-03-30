package com.newer.service;

import com.github.pagehelper.PageInfo;
import com.newer.domian.User;
import com.newer.dto.PageDto;

public interface UserService {
   //分页查询用户信息
	public PageInfo<User> findPage(PageDto pageDto);
	
	public String add(User user);
	
	//通过用户名密码查询用户
	public User select(User user);
}
