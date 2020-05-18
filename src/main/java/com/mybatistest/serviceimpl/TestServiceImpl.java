package com.mybatistest.serviceimpl;

import com.mybatistest.entity.TestEntity;
import com.mybatistest.mapper.TestMapper;
import com.mybatistest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper mapper;
    @Override
    public TestEntity backOneInfo(String name){
//        mapper.backOneInfo();
        return mapper.backOneInfo(name);
    }

    @Override
    public ArrayList<TestEntity> findAllUser() {
        return mapper.findAllUser();
    }

}
