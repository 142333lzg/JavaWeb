package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;

@Mapper // mybatis的mapper注解
public interface UserMapper {
    @Select("select * from user")
    public List<User> findAll();
}
