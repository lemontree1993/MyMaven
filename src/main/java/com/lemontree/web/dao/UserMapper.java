package com.lemontree.web.dao;

import com.lemontree.web.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}