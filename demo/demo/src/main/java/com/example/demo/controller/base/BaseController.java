package com.example.demo.controller.base;

public abstract class BaseController {

    protected final Response response(StateCode code, Object obj) {
        return new Response(code.name(), code.ordinal(), obj);
    }

}
