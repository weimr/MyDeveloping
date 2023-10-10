package com.weimr.designpatterns.abstractfactory.code;

/**
 * @author weimr
 * @title 产品等级1的实现类
 * @date 2023/10/10
 */
public class Creator1 extends AbstractCreator {
    //只生产产品等级为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    //只生产产品等级为1的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
