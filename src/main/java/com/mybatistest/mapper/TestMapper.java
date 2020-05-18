package com.mybatistest.mapper;

import com.mybatistest.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface TestMapper {
    @Select("select * from klyUserBaseTable where USERNAME=#{name}")
    TestEntity backOneInfo( String name );

    public ArrayList<TestEntity> findAllUser();
}
