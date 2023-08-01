package com.weimr.designpatterns.decorator.common;

/**
 * 具体装饰类1
 */
public class ConcreteDecorator1 extends Decorator{
    //定义被修饰者
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    //定义自己的修饰方法
    private void method1(){
        System.out.println("method1 修饰");
    }

    //重写父类的Operation方法
    @Override
    public void operation() {
        //调用父类的方法，可以在调用前后执行一些附加动作
        super.operation();
        this.method1();
    }
}
