package com.example.template.controller;

import com.example.template.common.constant.ResponseCode;
import com.example.template.common.model.response.Response;

/**
 * @author bin
 */
public abstract class AbstractController {

    protected Response response(ResponseCode code, Object data){
        Response response = new Response();
        response.setCode(code.getCode());
        response.setSucceed(code.getSucceed());
        response.setData(data);
        response.setMsg(code.getMsg());
        return response;
    }
}
