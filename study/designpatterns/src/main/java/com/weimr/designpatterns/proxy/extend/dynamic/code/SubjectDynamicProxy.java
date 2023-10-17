package com.weimr.designpatterns.proxy.extend.dynamic.code;

import java.lang.reflect.InvocationHandler;

/**
 * @author weimr
 * @title 具体业务的动态代理
 * @date 2023/10/17
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static<T> T newProxyInstance(Subject subject) {
        //获得ClassLoader
        ClassLoader  loader = subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
