package com.baizhi.dao;


import com.baizhi.entity.Student;

import java.util.List;

public interface StudentMapper {
  List<Student> selectAll();
}
