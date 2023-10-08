package com.weimr.designpatterns.methodfactory.code;

/**
 * @title 场景类
 * @author weimr
 * @date 2023/10/08
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        ContreteProduct1 product = creator.createProduct(ContreteProduct1.class);
        //继续业务处理
    }
}
