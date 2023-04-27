package com.example.sql2.controller;
import com.example.sql2.entity.user;
import com.example.sql2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class usercontroller {
    @Autowired
    private UserMapper usermapper;

    @GetMapping("/users")
    public List query(){

       List <user>list=usermapper.find();
        System.out.println(list);
        return list;
    }


    @PostMapping("/login")
    public  int login(@RequestBody user user ){
        int i= usermapper.login(user);
        return i;
}
    @PostMapping("/signin")
    public  String signing(user user ){
       int i=usermapper.signin(user);
        if (i == 0) {
            return "创建失败";
        }
        else return  "创建成功";

    }
}
