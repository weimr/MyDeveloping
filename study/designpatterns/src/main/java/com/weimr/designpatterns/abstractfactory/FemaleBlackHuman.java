package com.weimr.designpatterns.abstractfactory;

/**
 * @title 黑色女性人种
 * @author weimr
 * @date 2023/10/09
 */
public class FemaleBlackHuman extends AbstractYellowHuman{
    //黑人女性
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
