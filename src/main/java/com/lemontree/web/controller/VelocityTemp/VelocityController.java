package com.lemontree.web.controller.VelocityTemp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YLBG-YCY-1325 on 2017/2/6.
 */
@Controller
public class VelocityController extends AbstractController{

    @Override
    @RequestMapping("/vmview.htm")
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest,
                                                 HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("---------------------------enter VelocityController");
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        return new ModelAndView("vmview","list",list);
    }
}
