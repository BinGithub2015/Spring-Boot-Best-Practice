package com.example.template.common.model.response;

/**
 * @author bin
 */
public class Response<T> {
    private Integer code;
    private Boolean succeed;
    private T data;
    private String msg;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", succeed=" + succeed +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
