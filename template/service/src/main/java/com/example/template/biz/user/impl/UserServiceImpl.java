package com.example.template.biz.user.impl;

import com.example.template.biz.user.UserService;
import com.example.template.common.model.orm.User;
import com.example.template.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public User getById(int id) {

        // 保存字符串
        stringRedisTemplate.opsForValue().set("test", "test");
        String temp = stringRedisTemplate.opsForValue().get("test");
        log.info("redis test:{}",temp);

        return userMapper.getById(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
