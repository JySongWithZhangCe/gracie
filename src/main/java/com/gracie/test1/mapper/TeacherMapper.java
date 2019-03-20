package com.gracie.test1.mapper;

import com.gracie.test1.domain.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teaid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teaid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}