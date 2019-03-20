package com.gracie.test1.controller;

import com.gracie.test1.domain.User;
import com.gracie.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }
}
