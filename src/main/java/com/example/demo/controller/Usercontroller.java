package com.example.demo.controller;


import com.example.demo.entry.user;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller{

    @Autowired
    public UserServiceImpl userService;

    @RequestMapping(value = "/user")
    public int user(){
        user u=new user();
        u.setAge(1);
        u.setName("h");
        return userService.insert(u);
    }

    @RequestMapping(value = "/hello")
    public String hi(){
        return "hello";

    }
}