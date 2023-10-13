package com.weimr.designpatterns.builder.code;

/**
 * @author weimr
 * @title 导演类
 * @date 2023/10/13
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    //构建不同的产品
    public Product getProduct() {
        builder.setPart();
        /*
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
}
