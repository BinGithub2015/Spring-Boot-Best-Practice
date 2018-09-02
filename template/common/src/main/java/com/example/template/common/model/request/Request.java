package com.example.template.common.model.request;

import lombok.Data;

/**
 * @author bin
 *
 * 可以作为基类，继承并扩展不同需求的请求
 */
@Data
public class Request {
    /**
     * 请求的时间戳
     */
    private String timestamp;
    /**
     * 用于控制api的版本号<br/>
     * 不在url上体现版本上，从客户端的角度看，接口更友好<br/>
     * 服务端可以根据版本号信息在对应的controller里分发请求
     */
    private String version;
    /**
     * 请求的系统
     */
    private String os;
    /**
     * 地理坐标
     */
    private String coordinate;
    /**
     * 设备唯一标志
     */
    private String imei;
}
