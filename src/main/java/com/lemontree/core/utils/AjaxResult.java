package com.lemontree.core.utils;

import com.lemontree.core.baseEnum.ResCode;

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
}
