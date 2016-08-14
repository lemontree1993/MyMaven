package com.lemontree.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lemontree on 2016/8/8.
 */
public class Test {
    private String test;
    public static void main(String[] args) {
        System.out.println("1");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        MySpring t = (MySpring) context.getBean("myspring");
        System.out.println(t.getName());
    }
}
