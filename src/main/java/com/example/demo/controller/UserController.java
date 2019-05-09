package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by liweijun
 * on 2019-05-09 16:14
 **/
@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUserList(@PathVariable("id") Integer id){
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Integer id){
        userService.deleteById(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
