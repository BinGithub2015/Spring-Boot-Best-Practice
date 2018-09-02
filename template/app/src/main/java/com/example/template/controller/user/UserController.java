package com.example.template.controller.user;

import com.example.template.biz.user.UserService;
import com.example.template.common.constant.ResponseCode;
import com.example.template.common.model.orm.User;
import com.example.template.common.model.response.Response;
import com.example.template.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author bin
 */
@RestController
@RequestMapping("/api/user")
public class UserController extends AbstractController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Response<User> get(@PathVariable Integer id){
        User user = userService.getById(id);
        return this.response(ResponseCode.SUCCESS,user);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Response<User> post(@RequestBody User user){
        int count = userService.insert(user);
        return this.response(ResponseCode.SUCCESS,count);
    }

}
