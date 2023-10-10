package com.weimr.designpatterns.abstractfactory.demo;

/**
 * @title 黄色女性人种
 * @author weimr
 * @date 2023/10/09
 */
public class FemaleYellowHuman extends AbstractYellowHuman{
    //黄人女性
    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
