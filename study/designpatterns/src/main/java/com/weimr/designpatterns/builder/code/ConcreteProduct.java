package com.weimr.designpatterns.builder.code;

/**
 * @author weimr
 * @title 具体建造者
 * @date 2023/10/13
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();
    @Override
    public void setPart() {
        /*
         * 产品类内的逻辑处理
         */
    }
    //组件一个产品
    @Override
    public Product buildProduct() {
        return product;
    }
}
