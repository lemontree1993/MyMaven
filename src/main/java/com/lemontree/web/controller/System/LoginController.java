package com.lemontree.web.controller.System;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lemontree.common.baseEnum.ResCode;
import com.lemontree.common.exception.SysArgumentException;
import com.lemontree.common.exception.SysRuntimeException;
import com.lemontree.common.utils.AjaxResult;
import com.lemontree.web.entity.User;
import com.lemontree.web.service.system.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lemontree.web.model.UserModel;

/**
 * Created by lemontree on 2016/8/23.
 */
@Controller("LoginController")
@RequestMapping("/user")
public class LoginController {
    Logger LOG = Logger.getLogger(LoginController.class);
    @Autowired
    private UserService userService;


    @RequestMapping("/login.htm")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }


    @RequestMapping(value = "/regUser.htm",method = RequestMethod.POST)
    public @ResponseBody AjaxResult regUser(User user){
        try {
            userService.insertUsers(user);
        }catch (Exception e){
            LOG.error("user/regUser.htm : "+e.getMessage());
            return AjaxResult.failuer(
                    ResCode.SERVICE_ERROR.getRetCode(),ResCode.SERVICE_ERROR.getDesc());
        }
        return AjaxResult.success();
    }
}
