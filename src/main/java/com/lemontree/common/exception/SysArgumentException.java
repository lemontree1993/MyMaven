package com.lemontree.common.exception;

import com.lemontree.common.baseEnum.ResCode;

/**
 * 参数验证异常信息
 * Created by YLBG-YCY-1325 on 2017/2/21.
 */
public class SysArgumentException extends SysRuntimeException{
    static final long serialVersionUID = 1L;

    private Integer code;
    private String msg;

    public SysArgumentException(){
    }

    public SysArgumentException(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public SysArgumentException(ResCode resCode){
        this(resCode.getRetCode(),resCode.getDesc());
    }

    public SysArgumentException(String message){
        super(message);
        this.msg = message;
    }

    public SysArgumentException(Throwable cause){
        super(cause);
        this.msg = cause.getMessage();
    }

    public SysArgumentException(String message,Throwable cause){
        super(message,cause);
        this.msg = message;
    }

    public SysArgumentException(String message, Throwable cause,
                               boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.msg = message;
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
