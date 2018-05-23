package com.example.demo.controller.admin;

import com.example.demo.controller.base.BaseController;
import com.example.demo.controller.base.Response;
import com.example.demo.controller.base.StateCode;
import com.example.demo.db.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class AdminController extends BaseController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Response get() {
        return response(StateCode.SUCCESS, new User("a", 1));
    }

}
