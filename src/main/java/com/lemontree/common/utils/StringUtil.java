package com.lemontree.common.utils;

/**
 * Created by YLBG-YCY-1325 on 2017/2/18.
 */
public class StringUtil {

    /**
     * 空字符判断
     * @param str
     * @return
     */
    public static boolean isBlank(String str){
        if(null!=str && str.length()!=0){
            return true;
        }
        return false;
    }

    public static boolean isNotBlank(String str){
        if(null==str || str.length()==0){
            return true;
        }
        return false;
    }

}
