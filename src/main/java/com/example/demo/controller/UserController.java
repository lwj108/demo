package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value="获取用户列表", notes="")

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUserList(@PathVariable("id") Integer id){
        User user = userService.getUserById(id);
        return user;
    }

    @ApiOperation(value = "根据id删除用户", notes = "")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") Integer id){
        userService.deleteById(id);
    }

    @ApiOperation(value = "创建新用户", notes = "")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
