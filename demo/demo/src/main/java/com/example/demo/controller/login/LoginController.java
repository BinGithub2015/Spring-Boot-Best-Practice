package com.example.demo.controller.login;

import com.example.demo.controller.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController extends BaseController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Response post() {
        return response(StateCode.SUCCESS, new Object());
    }

}
