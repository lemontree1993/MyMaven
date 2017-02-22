package com.lemontree.web.serviceImpl.system;

import com.lemontree.web.dao.UserMapper;
import com.lemontree.web.model.UserModel;
import com.lemontree.web.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by YLBG-YCY-1325 on 2017/2/21.
 */
@Service("UserService")
public class UserServiceImpl implements UserService,Serializable{

    @Autowired
    private UserMapper userMapper;

    public int insertUsers(UserModel userModel) {
        if (null==userMapper){
            System.out.println("userMapper is null");
        }
        return 0;
    }
}
