package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping(value = "hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping(value = "/selectAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}
