package com.example.template.biz.user;


import com.example.template.common.model.orm.User;

public interface UserService {

    User getById(int id);

    int insert(User user);
}
