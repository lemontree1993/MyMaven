package com.lemontree.core.utils;

/**
 * Created by YLBG-YCY-1325 on 2017/2/18.
 */
public class StringUtil {

    /**
     *  字符去空
     * @param str
     * @return
     */
    public static String trimStr(String str){
        return null==str?null:str.trim();
    }

    /**
     * 空字符判断
     * @param str
     * @return
     */
    public static boolean isBlank(String str){
        if (null==str){
            return false;
        }
        if ("".equals(str.trim())){
            return false;
        }
        return true;
    }

}
