package com.weimr.designpatterns.abstractfactory.demo;

/**
 * @title 男性工厂
 * @author weimr
 * @date 2023/10/09
 */
public class MaleFactory implements HumanFactory {
    //生产出黄人男性
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
    //生产出白人男性
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    //生产出黑人男性
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
