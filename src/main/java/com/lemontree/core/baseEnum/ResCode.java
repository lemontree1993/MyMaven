package com.lemontree.core.baseEnum;

/**
 * Created by YLBG-YCY-1325 on 2017/2/18.
 */
public enum ResCode {
    OK(200,"成功"),
    SERVICE_ERROR(500,"服务器发送未知错误");

    private Integer retCode;
    private String desc;

    private ResCode(Integer code,String description){
        this.retCode = code;
        this.desc = description;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
