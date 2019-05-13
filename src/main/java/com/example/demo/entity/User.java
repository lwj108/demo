package com.example.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by liweijun
 * on 2019-05-09 16:13
 **/
@Component
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -1L;

    private Integer id;
    private String name;
    private Integer age;

}
