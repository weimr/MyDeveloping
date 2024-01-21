package com.weimr.designpatterns.flyweight.demo.before;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //从工厂中获得一个对象
        SignInfo signInfo = SignInfoFactory.getSignInfo();
        //进行其它业务处理
    }
}
