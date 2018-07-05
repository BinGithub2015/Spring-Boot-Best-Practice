package com.example.template.common.model.request;

/**
 * @author bin
 */
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
     * 地理位置
     */
    private String coordinate;
    /**
     * 设备唯一标志
     */
    private String imei;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Request{" +
                "timestamp='" + timestamp + '\'' +
                ", version='" + version + '\'' +
                ", os='" + os + '\'' +
                ", position='" + coordinate + '\'' +
                ", imei='" + imei + '\'' +
                '}';
    }
}
