package com.weimr.designpatterns.decorator.common;

/**
 * 具体Component构件
 */
public class ConcreteComponent extends Component{
    //具体实现
    @Override
    public void operation() {
        System.out.println("do something");
    }
}
