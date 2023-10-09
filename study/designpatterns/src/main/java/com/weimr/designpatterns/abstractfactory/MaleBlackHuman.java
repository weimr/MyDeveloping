package com.weimr.designpatterns.abstractfactory;

/**
 * @title 黑色男性人种
 * @author weimr
 * @date 2023/10/09
 */
public class MaleBlackHuman extends AbstractYellowHuman{
    //黑人男性
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
