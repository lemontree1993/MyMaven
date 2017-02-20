package com.lemontree.test;

import com.lemontree.web.entity.User;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lemontree on 2016/8/8.
 */
public class Test {
    private String test;
    public static void main(String[] args) {
        Logger LOG = Logger.getLogger(Test.class);
        try {
            User user = null;
            System.out.println(user.getAge());
        }catch (Exception e){
            LOG.info(e);
        }
    }
}
