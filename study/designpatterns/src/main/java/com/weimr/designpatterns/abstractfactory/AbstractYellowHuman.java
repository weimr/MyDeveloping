package com.weimr.designpatterns.abstractfactory;

/**
 * @title 黄色人种
 * @author weimr
 * @date 2023/10/09
 */
public abstract class AbstractYellowHuman implements Human {
    //黄色人种的皮肤颜色是黄色的
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的!");
    }

    //黄色人种讲话
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}
