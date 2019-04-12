package com.baizhi.controller;


import com.baizhi.dao.EmpMapper;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2 {
    @Autowired
    EmpMapper empMapper;

    @RequestMapping("select")
    public String  select(){
        Emp emp = empMapper.selectByPrimaryKey(1);
        emp.setId(1);
        int i = empMapper.updateByPrimaryKey(emp);
        System.out.println(i);
        return "index";
    }

}
