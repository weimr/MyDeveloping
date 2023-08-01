package com.weimr.designpatterns.decorator.common;

/**
 * Decorator装饰角色
 */
public abstract class Decorator extends Component {
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }
    //委托给构件
    @Override
    public void operation() {
        this.component.operation();
    }
}
