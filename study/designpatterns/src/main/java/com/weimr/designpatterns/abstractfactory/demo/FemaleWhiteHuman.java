package com.weimr.designpatterns.abstractfactory.demo;

/**
 * @title 白色女性人种
 * @author weimr
 * @date 2023/10/09
 */
public class FemaleWhiteHuman extends AbstractYellowHuman{
    //白人女性
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
