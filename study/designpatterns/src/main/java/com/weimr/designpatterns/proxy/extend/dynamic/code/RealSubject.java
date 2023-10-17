package com.weimr.designpatterns.proxy.extend.dynamic.code;

/**
 * @author weimr
 * @title 真实主题
 * @date 2023/10/17
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
