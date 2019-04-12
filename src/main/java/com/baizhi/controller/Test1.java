package com.baizhi.controller;

import com.baizhi.dao.StudentMapper;
import com.baizhi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("test")
public class Test1 {
    @Autowired
    StudentMapper studentDao;
    @RequestMapping("test1")
    @ResponseBody
    public List<Student> test(){
        List<Student> list = studentDao.selectAll();
        for (Student student : list) {
            System.out.println(student);
        }
        return list;
    }
}
