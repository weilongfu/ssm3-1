package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.StudentDao;
import com.newer.domian.Student;
import com.newer.domian.User;
import com.newer.dto.PageDto;
import com.newer.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;

	@Override
	public PageInfo<Student> findPage(PageDto pageDto) {
		//分页
				PageHelper.startPage(pageDto.getPage(),pageDto.getPageSize());
				
				List<Student> list=studentDao.selectAll();
				
				PageInfo<Student> pageinfo=new PageInfo<Student>(list);
				return pageinfo;
		
	}

	@Override
	public String deleteById(String stuid) {
		return studentDao.deleteByPrimaryKey(stuid)>0?"删除成功":"删除失败";
	}

	@Override
	public String update(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateByPrimaryKeySelective(student)>0?"修改成功":"修改失败";
	}

	@Override
	public String add(Student student) {
		// TODO Auto-generated method stub
		return studentDao.insertSelective(student)>0?"添加成功":"添加失败";
	}

}
