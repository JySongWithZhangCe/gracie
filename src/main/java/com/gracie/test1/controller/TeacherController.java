package com.gracie.test1.controller;

import com.gracie.test1.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/{classid}")
    public List<String> getTeacherNameByClassId(@PathVariable("classid") int id){
        return teacherService.getTeacherNameByClassId(id);
    }

}
