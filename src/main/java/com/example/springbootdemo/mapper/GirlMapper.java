package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.Girl;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GirlMapper {
    @Select("select * from girl where id = #{id}")
    Girl findGirlByGirlid(@Param("id") int id);
    @Insert("insert into girl (name,age) values (#{name},#{age})")
    boolean insertGirl(@Param("name") String name, @Param("age") int age);
    @Select("select * from girl")
    List<Girl> findAll();
}