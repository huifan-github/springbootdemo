package com.example.springbootdemo.service;


import com.example.springbootdemo.entity.User;

public interface IRegService {
    boolean regUser(String uerId, String pwd);
    User findUserByUserid(String userId);
}