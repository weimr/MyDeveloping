package com.weimr.designpatterns.proxy.extend.dynamic.code;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author weimr
 * @title 动态代理的Handler类
 * @date 2023/10/17
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target = null;
    //通过构造函数传递一个对象
    public MyInvocationHandler(Object _obj) {
        this.target = _obj;
    }
    //代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        return method.invoke(this.target, args);
    }
}

