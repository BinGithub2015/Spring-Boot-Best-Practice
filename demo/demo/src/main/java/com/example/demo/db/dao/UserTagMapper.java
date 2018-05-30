package com.example.demo.db.dao;

import com.example.demo.db.model.UserTag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbggenerated
     */
    int insert(UserTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbggenerated
     */
    UserTag selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbggenerated
     */
    List<UserTag> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserTag record);
}