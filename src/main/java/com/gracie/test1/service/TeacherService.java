package com.gracie.test1.service;

import com.gracie.test1.domain.ClassBean;
import com.gracie.test1.mapper.ClassMapper;
import com.gracie.test1.mapper.ClassTeacherMapper;
import com.gracie.test1.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private ClassTeacherMapper classTeacherMapper;

    public List<String> getTeacherNameByClassId(int id){
        ClassBean class1= classMapper.selectByPrimaryKey(id);
        System.out.println(class1.getClassid());
        System.out.println(classTeacherMapper.selectByClassId(class1.getClassid()));
        return classTeacherMapper.selectByClassId(class1.getClassid()).stream()
        .map(ct -> teacherMapper.selectByPrimaryKey(ct.getTeaid()).getTeaname()).collect(Collectors.toList());

    }
}
