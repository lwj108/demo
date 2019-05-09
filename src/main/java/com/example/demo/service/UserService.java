package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liweijun
 * on 2019-05-09 16:34
 **/
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }

    public void deleteById(Integer id){
        userMapper.deleteById(id);
    }

    public int createUser(User user){
        return userMapper.createUser(user);
    }
}
