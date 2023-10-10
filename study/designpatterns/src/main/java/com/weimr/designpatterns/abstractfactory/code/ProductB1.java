package com.weimr.designpatterns.abstractfactory.code;

/**
 * @author weimr
 * @title 产品B1的实现类
 * @date 2023/10/10
 */
public class ProductB1 extends AbstractProductB{
    @Override
    public void doSomething() {
        System.out.println("产品B1的实现方法");
    }
}
