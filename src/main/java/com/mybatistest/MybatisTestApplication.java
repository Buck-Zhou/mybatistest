package com.mybatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "com.mybatistest.entity")
//@EntityScan(basePackages = "com.mybatistest.entity")
//@ComponentScan(basePackages = "com.mybatistest.web")
//@ComponentScan(basePackages = "com.mybatistest.service")
@SpringBootApplication
@MapperScan(basePackages = "com.mybatistest.mapper")
public class MybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisTestApplication.class, args);
    }
}
