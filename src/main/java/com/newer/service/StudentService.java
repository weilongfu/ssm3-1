package com.newer.service;

import com.github.pagehelper.PageInfo;
import com.newer.domian.Student;
import com.newer.domian.User;
import com.newer.dto.PageDto;

public interface StudentService {
	   //分页查询学生信息
		public PageInfo<Student> findPage(PageDto pageDto);
		
		//删除
		public String deleteById(String stuid);
		
		//修改
		public String update(Student student);
		
		//添加
		public String add(Student student);
}
