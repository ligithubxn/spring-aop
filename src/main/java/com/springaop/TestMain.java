package com.springaop;

import com.springaop.test.HelloAop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/1/3.
 */
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloAop aop = (HelloAop) ctx.getBean("helloAop");
        aop.doPrint();

        
    }
}
