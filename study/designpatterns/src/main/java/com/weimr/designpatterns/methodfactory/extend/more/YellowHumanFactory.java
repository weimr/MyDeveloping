package com.weimr.designpatterns.methodfactory.extend.more;

/**
 * @title 黄色人种创建工厂实现
 * @author weimr
 * @date 2023/10/07
 */
public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
