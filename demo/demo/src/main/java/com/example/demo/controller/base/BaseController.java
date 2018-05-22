package com.example.demo.controller.base;

public abstract class BaseController {

    protected enum StateCode {
        FAIL,
        SUCCESS;
    }

    protected class Response {
        String state;
        int code;
        Object body;

        public Response(String state, int code, Object body) {
            this.state = state;
            this.code = code;
            this.body = body;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public Object getBody() {
            return body;
        }

        public void setBody(Object body) {
            this.body = body;
        }
    }

    protected final Response response(StateCode code, Object obj) {
        return new Response(code.name(), code.ordinal(), obj);
    }

}
