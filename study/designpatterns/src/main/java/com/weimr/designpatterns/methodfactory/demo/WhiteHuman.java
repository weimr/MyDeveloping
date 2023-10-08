package com.weimr.designpatterns.methodfactory.demo;

/**
 * @title 白色人种
 * @author weimr
 * @date 2023/10/07
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般都是单字节。");
    }
}
