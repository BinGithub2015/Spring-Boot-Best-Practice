package com.example.template.mybatis.mapper;

import com.example.template.mybatis.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("SELECT id, name FROM user WHERE id = #{id}")
    User getById(@Param("id") Integer id);

    @Insert("INSERT INTO user (name) VALUES (#{name})")
    int insert(User user);

    @Update("UPDATE user SET name=#{name} WHERE id=#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Integer id);
}
