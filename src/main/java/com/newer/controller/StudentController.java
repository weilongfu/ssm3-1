package com.newer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domian.Score;
import com.newer.domian.Student;
import com.newer.domian.StudentDto;
import com.newer.dto.PageDto;
import com.newer.service.ScoreService;
import com.newer.service.StudentDtoService;
import com.newer.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService StudentService;
	@Autowired
	private StudentDtoService studentDtoService;
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping("/findPage")
	public PageInfo<Student> findPage(@RequestBody PageDto pageDto) {
		PageInfo<Student>  pageinfo=StudentService.findPage(pageDto);
		return pageinfo;
	}
	
	@RequestMapping("/deletebyid")
	public String deletebyid(@RequestParam(value = "stuid",required=false) String stuid) {
		return StudentService.deleteById(stuid);
	}
	
	@RequestMapping("/update")
	public String update(@RequestBody Student student) {
		return StudentService.update(student);
	}
	
	@RequestMapping("/add")
	public String add(@RequestBody Student student) {
		return StudentService.add(student);
	}
	
	
	@RequestMapping("/subSelect")
	public List<StudentDto> add(@RequestParam(value = "stuid",required=false) String stuid) {
		return studentDtoService.selectByStuid(stuid);
	}
	
	@RequestMapping("/addscore")
	public String addscore(@RequestBody Score score) {
		return scoreService.addScore(score);
	}
}
