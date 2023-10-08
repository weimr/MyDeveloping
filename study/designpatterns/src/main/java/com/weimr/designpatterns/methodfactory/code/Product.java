package com.weimr.designpatterns.methodfactory.code;

/**
 * @title 抽象产品类
 * @author weimr
 * @date 2023/10/08
 */
public abstract class Product {
    //产品类的公共方法
    public void method1() {
        //业务逻辑处理
    }
    //抽象方法
    public abstract void method2();
}
