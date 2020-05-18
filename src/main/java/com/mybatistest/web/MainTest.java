package com.mybatistest.web;

import com.mybatistest.entity.TestEntity;
import com.mybatistest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
//import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
public class MainTest {
    @Autowired
    TestService service;
    @RequestMapping("/abc")
    public void backOneInfo(@RequestParam(name="name") String name ){
        System.out.println(service.backOneInfo(name));

    }
    @RequestMapping("def")
    public ArrayList<TestEntity> findAllUser() {
        System.out.println("==================================================================");
        ArrayList<TestEntity> list=service.findAllUser();
        System.out.println(list.toString());
        return list;
    }
}
