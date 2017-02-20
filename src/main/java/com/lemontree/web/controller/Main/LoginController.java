package com.lemontree.web.controller.Main;

import com.lemontree.web.model.UserModel;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @ResponseBody
    @RequestMapping(value = "/regUser.htm",method = RequestMethod.POST)
    public JSONObject regUser(UserModel userModel, ModelMap map){
        JSONObject data = null;
        System.out.println(data.get("i"));
        System.out.println(userModel);
        map.put("code",200);
        map.put("msg","0K");
        data.put("data",data);
        return data;
    }
}
