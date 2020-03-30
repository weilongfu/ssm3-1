package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.domian.StudentDto;

import tk.mybatis.mapper.common.Mapper;

public interface StudentDtoDao extends Mapper<StudentDto>{
	
	@Results(id = "StudentDtoMap", value = {
			@Result(id = true, column = "stu_id", property = "stuid"),
			@Result(column = "stu_name", property = "stuname"),
			@Result(column = "subid", property = "subid"),
			@Result(column = "score", property = "score"),
			@Result(column = "subname", property = "subname"),
			})
    @Select("select * from t_student student left  join t_score score on "
    		+ "student.stu_id=score.stuid left join t_subject sub on "
    		+ "score.subid=sub.subid where stu_id=#{stuid}")
    public List<StudentDto> selectByStuid(String stuid);
}
