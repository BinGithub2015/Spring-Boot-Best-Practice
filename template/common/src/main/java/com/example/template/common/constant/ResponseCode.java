package com.example.template.common.constant;

/**
 * @author bin
 */
public enum ResponseCode {

    SUCCESS(200,true,"成功"),FAIL(0,false,"失败");

    private Integer code;
    private Boolean succeed;
    private String msg;

    ResponseCode(Integer code,Boolean succeed,String msg) {
        this.code = code;
        this.succeed = succeed;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
