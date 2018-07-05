package com.example.template.controller.test;

import com.example.template.common.model.response.Response;
import com.example.template.controller.AbstractController;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bin
 */
@RestController
@RequestMapping("/api/v1/test")
public class TestController extends AbstractController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Response get(){

        return null;
    }

}
