package com.lemontree.common.base;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lemontree on 2016/8/9.
 */
public interface BaseDao<T> extends Serializable {
    int insert(T record);
    int insertSelective(T record);
    List<T> getByUserId(String userId);
}
