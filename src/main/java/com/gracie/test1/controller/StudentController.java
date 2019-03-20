package com.gracie.test1.controller;

import com.gracie.test1.mapper.StudentMapper;
import com.gracie.test1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public String getYearsOldById(@PathVariable("id") int id){
        if(studentService.getYearsOldById(id)==-1){
            String alert1="没有这个学生！";
            return alert1;
        }
        if(studentService.getYearsOldById(id)==-2){
            String alert2="该学生没有出生日期！";
            return alert2;
        }
        String studentYearsOld=studentService.getYearsOldById(id).toString();
        return studentYearsOld;
    }
}
