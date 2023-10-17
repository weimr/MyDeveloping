package com.weimr.designpatterns.proxy.extend.dynamic.code;

/**
 * @author weimr
 * @title 场景类2
 * @date 2023/10/17
 */
public class Client2 {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("Finish");
    }
}
