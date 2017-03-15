package com.lemontree.web.controller.System;

import com.lemontree.common.baseEnum.ResCode;
import com.lemontree.common.utils.AjaxResult;
import com.lemontree.web.controller.BaseController;
import com.lemontree.web.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by lemontree on 2016/8/23.
 */
@Controller("LoginController")
@RequestMapping("/user")
public class LoginController extends BaseController{
    @Autowired
    private UserService userService;

    /**
     * 登录页跳转
     * @param request 请求头
     * @param response 响应头
     * @return
     */
    @RequestMapping("/login.htm")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }

    /**
     * 用户注册
     * @param user 用户信息
     * @return 成功信息
     */
//    @RequestMapping(value = "/regUser.htm", method = RequestMethod.POST)
//    public @ResponseBody AjaxResult regUser(User user){
//        try {
////            userService.insertUsers(user);
//        } catch (Exception e){
//            LOG.error("user/regUser.htm : "+ e.getMessage());
//            return AjaxResult.failuer(
//                    ResCode.SERVICE_ERROR.getRetCode(), ResCode.SERVICE_ERROR.getDesc());
//        }
//        return AjaxResult.success();
//    }
}
