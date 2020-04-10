package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    User selectUserByName(String name);
    List<User> selectAllUser();
    void insertService();
    void deleteService(int id);
    void changemoney();
}
