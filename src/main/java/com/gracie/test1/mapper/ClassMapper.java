package com.gracie.test1.mapper;

import com.gracie.test1.domain.ClassBean;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(ClassBean record);

    int insertSelective(ClassBean record);

    ClassBean selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(ClassBean record);

    int updateByPrimaryKey(ClassBean record);
}