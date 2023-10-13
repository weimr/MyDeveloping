package com.weimr.designpatterns.builder.code;

/**
 * @author weimr
 * @title 抽象建造者
 * @date 2023/10/13
 */
public abstract class Builder {
    //设置产品的不同部分，以获得不同的产品
    public abstract void setPart();
    //建造产品
    public abstract Product buildProduct();
}
