package com.lemontree.common.utils;

import com.lemontree.common.baseEnum.ResCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YLBG-YCY-1325 on 2017/2/18.
 */
public class AjaxResult {

    private Integer resCode;
    private String resMsg;
    private Map<String,Object> model;

    public AjaxResult(){

    }
    public AjaxResult(Integer resCode,String resMsg,Map<String,Object>datas){
        this.resCode = resCode;
        this.resMsg = resMsg;
        this.model = new HashMap<String, Object>();
        if (null!=datas && 0<datas.size()){
            this.model.putAll(datas);
        }
    }
    public AjaxResult(ResCode resCode){
        this.resCode = resCode.getRetCode();
        this.resMsg = resCode.getDesc();
        this.model = new HashMap<String, Object>();
    }

    public AjaxResult addObject(String key,Object data){
        getModel().put(key,data);
        return this;
    }

    public AjaxResult addAllObject(Map<String,Object>datas){
        if (null != datas && 0<datas.size()){
            getModel().putAll(datas);
        }
        return this;
    }

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public Map<String, Object> getModel() {
        if (null == model){
            this.model = new HashMap<String, Object>();
        }
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }

    /**
     * 成功返回的状态
     * @return
     */
    public static AjaxResult success(){
        return new AjaxResult(ResCode.OK);
    }

    /**
     * 成功返回的状态，自定义描述
     * @param msg
     * @return
     */
    public static AjaxResult success(String msg){
        AjaxResult result = new AjaxResult(ResCode.OK);
        result.setResMsg(msg);
        return result;
    }

    /**
     * 失败返回的状态
     * @return
     */
    public static AjaxResult failuer(){
        return new AjaxResult(ResCode.FAIL);
    }

    /**
     * 失败返回的状态，自定义描述
     * @param failMsg
     * @return
     */
    public static AjaxResult failuer(String failMsg){
        AjaxResult result = new AjaxResult(ResCode.FAIL);
        result.setResMsg(failMsg);
        return result;
    }

    public static AjaxResult failuer(Integer resCode,String failMsg){
        AjaxResult result = new AjaxResult();
        result.setResMsg(failMsg);
        result.setResCode(resCode);
        return result;
    }

}
