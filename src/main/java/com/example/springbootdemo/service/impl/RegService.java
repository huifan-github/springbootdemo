package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class RegService implements IRegService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean regUser(String uerId, String pwd) {

        Boolean flag;
        try {
            flag = userMapper.insertUsers(uerId,pwd);
        }catch (Exception e){
            return false;
        }
        return flag;
    }

    public User findUserByUserid(String userId) {
        User user = userMapper.findUserByUserid(userId);
        return user;
    }

}