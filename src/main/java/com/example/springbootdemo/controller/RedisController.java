package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * redisController
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    RedisService redisService;

    /**
     * 20      * 设置Str缓存
     * 21      * @param key
     * 22      * @param val
     * 23      * @return
     * 24
     */
    @RequestMapping(value = "setStr")
    public String setStr(String key, String val) {
        try {
            redisService.setStr(key, val);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 37      * 根据key查询Str缓存
     * 38      * @param key
     * 39      * @return
     * 40
     */
    @RequestMapping(value = "getStr")
    public String getStr(String key) {
        return redisService.getStr(key);
    }


    /**
     * 48      * 根据key产出Str缓存
     * 49      * @param key
     * 50      * @return
     * 51
     */
    @RequestMapping(value = "delStr")
    public String delStr(String key) {
        try {
            redisService.del(key);
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }


    /**
     * 64      * 设置obj缓存
     * 65      * @param key
     * 66      * @param user
     * 67      * @return
     * 68
     */
    @RequestMapping(value = "setObj")
    public String setObj(String key, User user) {
        try {
            redisService.setObj(key, user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 81      * 获取obj缓存
     * 82      * @param key
     * 83      * @return
     * 84
     */
    @RequestMapping(value = "getObj")
    public Object getObj(String key) {
        return redisService.getObj(key);
    }


    /**
     * 92      * 删除obj缓存
     * 93      * @param key
     * 94      * @return
     * 95
     */
    @RequestMapping(value = "delObj")
    public Object delObj(String key) {
        try {
            redisService.delObj(key);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

}