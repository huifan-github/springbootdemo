package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.Girl;
import com.example.springbootdemo.mapper.GirlMapper;
import com.example.springbootdemo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class GirlServiceimpl implements GirlService {
    @Autowired
    private GirlMapper girlMapper;

    @Override
    public boolean insertGirl(String name, int age) {

        Boolean flag;
        try {
            flag = girlMapper.insertGirl(name, age);
        } catch (Exception e) {
            return false;
        }
        return flag;
    }

    public Girl findGirlByGirlid(int id) {
        Girl girl = girlMapper.findGirlByGirlid(id);
        return girl;
    }

    @Override
    public List<Girl> findAll() {
        List<Girl> girls = girlMapper.findAll();
        return girls;
    }


}