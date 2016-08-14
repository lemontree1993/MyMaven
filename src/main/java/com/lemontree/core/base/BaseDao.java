package com.lemontree.core.baseDao;

/**
 * Created by lemontree on 2016/8/9.
 */
public interface BaseDao <T> {
    int insert(T record);

    int insertSelective(T record);
}
