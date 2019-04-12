package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.baizhi.dao")
public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }
}
