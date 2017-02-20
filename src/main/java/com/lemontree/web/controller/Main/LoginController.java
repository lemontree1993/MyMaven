package com.lemontree.web.controller.Main;

import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lemontree.web.model.UserModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemontree on 2016/8/23.
 */
@Controller("LoginController")
@RequestMapping("/user")
public class LoginController {
    Logger LOG = Logger.getLogger(LoginController.class);

    @RequestMapping("/login.htm")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }


    @RequestMapping(value = "/regUser.htm",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public JSONObject regUser(UserModel userModel,ModelMap map,HttpServletResponse response){
        JSONObject json = new JSONObject();
        List<String> list = new ArrayList<String>();
        list.add("aa");
        map.put("11","2");
        json.put("sss",11);
        return json;
    }
}
