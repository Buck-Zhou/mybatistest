package com.mybatistest.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Timestamp;

@EntityScan
@Data
public class TestEntity {
    private Integer userId;//自增 id
    private String userName;//用户名
    private String userPassword;//密码
    private String userInDept;//部门
    private String userRole;//角色
    private Timestamp creationDatetime;//创建时间
    private String creationUser;//创建人
    private Timestamp lastUpDateDateTime;//最后修改时间
    private String lastupuser;//最后修改人
    private String chinesename;//用户中文名
    private Integer deptid;//部门id
}
