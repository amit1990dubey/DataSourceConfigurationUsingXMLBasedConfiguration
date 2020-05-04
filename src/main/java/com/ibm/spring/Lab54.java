package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab54 {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ibmindia.xml");
        TestService ts =(TestService)ctx.getBean("ts");
        //ts.showOrcaleInfo();
        ts.showMySQLInfo();
        System.out.println("done");
    }
}
