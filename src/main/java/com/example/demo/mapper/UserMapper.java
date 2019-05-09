package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liweijun
 * on 2019-05-09 16:30
 **/
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);

    @Delete("delete from user where id=#{id}")
    public int deleteById(Integer id);

    @Insert("insert into user (id,name,age) values (#{id},#{name},#{age})")
    public int createUser(User user);
}
