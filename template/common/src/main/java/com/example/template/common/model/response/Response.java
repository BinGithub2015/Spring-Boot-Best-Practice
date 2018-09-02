package com.example.template.common.model.response;

import lombok.Data;

/**
 * @author bin
 */
@Data
public class Response<T> {
    private Integer code;
    private Boolean succeed;
    private T data;
    private String msg;
}
