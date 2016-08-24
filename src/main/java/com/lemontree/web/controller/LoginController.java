package com.lemontree.web.controller;

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
        System.out.println("1");
        return "login";
    }

}
