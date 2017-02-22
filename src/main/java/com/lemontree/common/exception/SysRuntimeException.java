package com.lemontree.common.exception;

import com.lemontree.common.baseEnum.ResCode;

/**
 * 系统运行异常父类
 * Created by YLBG-YCY-1325 on 2017/2/21.
 */
public class SysRuntimeException extends RuntimeException{
    static final long serialVersionUID = 1L;

    private Integer code;
    private String msg;

    public SysRuntimeException(){

    }

    public SysRuntimeException(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public SysRuntimeException(ResCode resCode){
        this(ResCode.SERVICE_ERROR.getRetCode(),
                ResCode.SERVICE_ERROR.getDesc());
    }

    public SysRuntimeException(String message){
        super(message);
        this.code = ResCode.SERVICE_ERROR.getRetCode();
        this.msg = message;
    }

    public SysRuntimeException(Throwable cause){
        super(cause);
        this.code = ResCode.SERVICE_ERROR.getRetCode();
        this.msg = cause.getMessage();
    }

    public SysRuntimeException(String message,Throwable cause){
        super(message,cause);
        this.code = ResCode.SERVICE_ERROR.getRetCode();
        this.msg = message;
    }

    public SysRuntimeException(String message, Throwable cause,
      boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.msg = message;
        this.code = ResCode.SERVICE_ERROR.getRetCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
