package com.weimr.designpatterns.flyweight.demo.before;

/**
 * 报考信息工厂
 */
public class SignInfoFactory {
    //报名信息的对象工厂
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }
}
