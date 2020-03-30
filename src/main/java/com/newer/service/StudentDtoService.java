package com.newer.service;

import java.util.List;

import com.newer.domian.StudentDto;

public interface StudentDtoService {
      public List<StudentDto> selectByStuid(String stuid);
}
