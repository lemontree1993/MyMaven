package com.lemontree.web.controller.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lemontree on 2016/8/23.
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login.htm")
    public String Login(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }
    @RequestMapping("/index.htm")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "index_test";
    }

}
