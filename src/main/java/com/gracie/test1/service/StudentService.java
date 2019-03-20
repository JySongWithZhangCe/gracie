package com.gracie.test1.service;

import com.gracie.test1.domain.Student;
import com.gracie.test1.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class StudentService {
    @Autowired
    private StudentMapper  studentMapper;

    public Integer getYearsOldById(int id){
        Student student=studentMapper.selectByPrimaryKey(id);
        if(student==null) {
            return -1;
        }
        Date birthday=student.getStubirthday();
        if(birthday==null){
            return -2;
        }
        Integer birthYear=birthday.getYear();
        Integer thisYear= Calendar.YEAR;
        Integer stuYearsOld=thisYear-birthYear;
        return stuYearsOld;
    }
}
