package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.StudentDtoDao;
import com.newer.domian.StudentDto;
import com.newer.service.StudentDtoService;

@Service
public class StudentDtoServiceImpl implements StudentDtoService{
     @Autowired
     private StudentDtoDao studentDtoDao;
	@Override
	public List<StudentDto> selectByStuid(String stuid) {
		List<StudentDto> list=studentDtoDao.selectByStuid(stuid);
		return list;
	}

}
