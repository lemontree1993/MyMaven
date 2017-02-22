package com.lemontree.web.controller.System;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by YLBG-YCY-1325 on 2017/2/18.
 */
@Controller
@RequestMapping("/index.htm")
public class IndexController {
        Logger LOG = Logger.getLogger(IndexController.class);

        @RequestMapping(method = RequestMethod.GET)
        public String gotoIndex(HttpServletRequest request,
                                HttpServletResponse response){
            return "index_test";
        }

}
