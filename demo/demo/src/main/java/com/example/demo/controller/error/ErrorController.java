package com.example.demo.controller.error;

import com.example.demo.controller.base.BaseController;
import com.example.demo.controller.base.Response;
import com.example.demo.controller.base.StateCode;
import com.example.demo.db.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/error")
public class ErrorController extends BaseController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Response get() {
        int a = 0;
        int b = 1 / a;
        return response(StateCode.SUCCESS,"test");
    }

}
