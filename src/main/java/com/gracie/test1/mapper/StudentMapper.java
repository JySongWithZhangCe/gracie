package com.gracie.test1.mapper;

import com.gracie.test1.domain.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}