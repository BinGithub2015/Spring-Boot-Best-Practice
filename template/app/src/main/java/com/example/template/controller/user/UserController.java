package com.example.template.controller.user;

import com.example.template.common.constant.ResponseCode;
import com.example.template.common.model.response.Response;
import com.example.template.controller.AbstractController;
import com.example.template.domain.user.UserVo;
import com.example.template.mybatis.domain.User;
import com.example.template.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bin
 */
@RestController
@RequestMapping("/api/user")
public class UserController extends AbstractController {

    @Autowired
    UserMapper userMapper;

    //service
    @RequestMapping("/{id}")
    public Response<User> get(@PathVariable Integer id){
        User user = userMapper.getById(id);
        return this.response(ResponseCode.SUCCESS,user);
    }

    //service
    @RequestMapping("/")
    public Response<User> post(@RequestBody UserVo user){
        return this.response(ResponseCode.SUCCESS,user);
    }

}
