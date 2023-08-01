package com.weimr.designpatterns.mediator;

/**
 * 具体同事类1
 */
public class ConcreteColleague1 extends Colleague{
    //通过构造函数传递中介者
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    //自有方法
    public void selfMethod1() {
        //处理自己的业务逻辑
    }
    //依赖方法
    public void depMethod1() {
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething1();
    }
}
