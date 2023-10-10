package com.weimr.designpatterns.abstractfactory.demo;

/**
 * @title 黄色男性人种
 * @author weimr
 * @date 2023/10/09
 */
public class MaleYellowHuman extends AbstractYellowHuman{
    //黄人男性
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
