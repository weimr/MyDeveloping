package com.weimr.designpatterns.abstractfactory.code;

/**
 * @author weimr
 * @title 产品等级2的实现类
 * @date 2023/10/10
 */
public class Creator2 extends AbstractCreator {
    //只生产产品等级为2的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    //只生产产品等级为2的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
