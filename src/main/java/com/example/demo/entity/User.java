package com.example.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by liweijun
 * on 2019-05-09 16:13
 **/
@Component
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
