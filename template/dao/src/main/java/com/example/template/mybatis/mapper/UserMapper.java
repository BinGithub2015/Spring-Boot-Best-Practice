package com.example.template.mybatis.mapper;

import com.example.template.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT id, name FROM user WHERE id = #{state}")
    User getById(Integer id);

}
