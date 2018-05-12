package com.bestpractice.db.mysql.mapper;


import com.bestpractice.db.mysql.model.Url;

public interface UrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Url record);

    int insertSelective(Url record);

    Url selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Url record);

    int updateByPrimaryKey(Url record);
}