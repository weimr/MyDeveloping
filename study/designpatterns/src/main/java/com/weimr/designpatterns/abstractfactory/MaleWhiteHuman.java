package com.weimr.designpatterns.abstractfactory;

/**
 * @title 白色男性人种
 * @author weimr
 * @date 2023/10/09
 */
public class MaleWhiteHuman extends AbstractYellowHuman{
    //白人男性
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
