package com.weimr.designpatterns.proxy.extend.dynamic.code;

import java.lang.reflect.InvocationHandler;

/**
 * @author weimr
 * @title 场景类
 * @date 2023/10/17
 */
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        //代理行为
        proxy.doSomething("Finish");
    }
}
