package com.mybatistest.service;

import com.mybatistest.entity.TestEntity;

import java.util.ArrayList;

public interface TestService {
    TestEntity  backOneInfo( String name );
    public ArrayList<TestEntity> findAllUser();
}
