package com.lemontree.web.service.system;

import com.lemontree.web.model.UserModel;
import org.springframework.stereotype.Service;

/**
 * Created by YLBG-YCY-1325 on 2017/2/21.
 */
public interface UserService {
    int insertUsers(UserModel userModel);
}
