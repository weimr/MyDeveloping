package com.weimr.designpatterns.abstractfactory.code;

/**
 * @author weimr
 * @title 抽象工厂类
 * @date 2023/10/10
 */
public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();
    //创建B产品家族
    public abstract AbstractProductB createProductB();
}
