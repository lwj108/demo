package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by liweijun
 * on 2019-05-09 16:30
 **/
@Mapper
@CacheConfig(cacheNames = "users")
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    @Cacheable(key ="#p0")
    public User getUserById(Integer id);

    @CacheEvict(key ="#p0",allEntries=true)
    @Delete("delete from user where id=#{id}")
    public int deleteById(Integer id);

    @Insert("insert into user (id,name,age) values (#{id},#{name},#{age})")
    public int createUser(User user);
}
