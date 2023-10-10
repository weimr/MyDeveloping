package com.weimr.designpatterns.abstractfactory.code;

/**
 * @author weimr
 * @title 抽象产品类A
 * @date 2023/10/10
 */
public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod() {}
    //每个产品相同方法，不同实现
    public abstract void doSomething();
}
