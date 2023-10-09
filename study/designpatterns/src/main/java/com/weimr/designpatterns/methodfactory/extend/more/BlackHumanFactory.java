package com.weimr.designpatterns.methodfactory.extend.more;

/**
 * @title 黑色人种创建工厂实现
 * @author weimr
 * @date 2023/10/07
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
