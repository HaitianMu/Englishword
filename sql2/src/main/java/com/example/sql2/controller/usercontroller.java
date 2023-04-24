package com.example.sql2.controller;
import com.example.sql2.entity.user;
import com.example.sql2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usercontroller {
    @Autowired
    private UserMapper usermapper;

    @GetMapping("/user")
    public List query(){

       List <user>list=usermapper.find();
        System.out.println(list);
        return list;
    }

    @PostMapping("/user")
    public  String save(user user ){
       int i=usermapper.insert(user);
        if (i == 0) {
            return "创建失败";
        }
        else return  "创建成功";

    }
}
