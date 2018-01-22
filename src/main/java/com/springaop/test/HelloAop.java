package com.springaop.test;

/**
 * Created by Administrator on 2018/1/3.
 */
public class HelloAop {
    public void printHelloWorld()
    {
        System.out.println("我是HelloAop.printHelloWorld()，开始调用我了");
    }

    public void doPrint()
    {
        System.out.println("我是 HelloAop.doPrint()，开始调用我了");
        return ;
    }
}
