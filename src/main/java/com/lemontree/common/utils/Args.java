package com.lemontree.common.utils;

import com.lemontree.common.exception.SysArgumentException;

/**
 * Created by YLBG-YCY-1325 on 2017/2/21.
 */
public class Args {

    /**
     * 验证表达式是否成立，不成立则抛出异常
     * @param exression
     * @param message
     */
    public static void check(final boolean exression,final String message){
        if (!exression){
            throw new SysArgumentException(message);
        }
    }

}
