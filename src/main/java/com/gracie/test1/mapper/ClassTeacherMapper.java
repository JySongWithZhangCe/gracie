package com.gracie.test1.mapper;

import com.gracie.test1.domain.ClassTeacherKey;

import java.util.List;


public interface ClassTeacherMapper {
    int deleteByPrimaryKey(ClassTeacherKey key);

    int insert(ClassTeacherKey record);

    int insertSelective(ClassTeacherKey record);

    List<ClassTeacherKey> selectByClassId(Integer classid);
}