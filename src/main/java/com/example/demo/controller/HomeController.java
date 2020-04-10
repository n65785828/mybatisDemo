package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "hello springBoot~";
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public User testQuery() {
        return userService.selectUserByName("Daisy");
    }

    @RequestMapping("/insert")
    public List<User> testInsert() {
        userService.insertService();
        return userService.selectAllUser();
    }


    @RequestMapping("/changemoney")
    public List<User> testchangemoney() {
        userService.changemoney();
        return userService.selectAllUser();
    }

    @RequestMapping("/delete")
    public String testDelete() {
        userService.deleteService(3);
        return "OK";
    }
}
