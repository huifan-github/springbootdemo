package com.example.springbootdemo.service;


import com.example.springbootdemo.entity.Girl;

import java.util.List;

public interface GirlService {
    boolean insertGirl(String name, int age);
    Girl findGirlByGirlid(int id);
    List<Girl> findAll();
}