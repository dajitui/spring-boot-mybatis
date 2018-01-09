package com.example.demo.dao;


import com.example.demo.entry.user;

public interface userMapper {
    int insert(user record);

    int insertSelective(user record);
}