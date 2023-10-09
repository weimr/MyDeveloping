package com.weimr.designpatterns.abstractfactory;

/**
 * @title 黑色人种
 * @author weimr
 * @date 2023/10/09
 */
public abstract class AbstractBlackHuman implements Human {
    //黑色人种的皮肤颜色是黑色的
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的!");
    }

    //黑色人种讲话
    public void talk() {
        System.out.println("黑色人种会说话，一般人听不懂。");
    }
}
