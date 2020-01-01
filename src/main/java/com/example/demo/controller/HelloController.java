package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/")
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping(value = "hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping(value = "user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping(value = "user/{id}")
    public User selectById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @PutMapping(value = "user/{id}")
    public  int update(@PathVariable Long id, User user){
        return userService.update(user);
    }

    @PostMapping(value = "user")
    public int insert(User user){
        return userService.insert(user);
    }

    @DeleteMapping(value = "user/{id}")
    public int delete(@PathVariable Integer id){
        return userService.delete(id);
    }

}
