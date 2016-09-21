package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/9/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        service.login(user);
        return "ok";
    }
    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){
        service.register(user);
        return "ok";
    }
}
