package com.weimr.designpatterns.abstractfactory.demo;

/**
 * @title 女性工厂
 * @author weimr
 * @date 2023/10/09
 */
public class FemaleFactory implements HumanFactory {
    //生产出黄人女性
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
    //生产出白人女性
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    //生产出黑人女性
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
