package com.weimr.designpatterns.mediator.demo;

/**
 * 抽象同事类
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }
}
