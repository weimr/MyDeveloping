package com.weimr.designpatterns.methodfactory.extend.singleton;

/**
 * @title 单例类
 * @author weimr
 * @date 2023/10/09
 */
public class Singleton {
    //不允许通过new产生一个对象
    private Singleton() {}
    public void doSomething() {
        //业务处理
    }
}
