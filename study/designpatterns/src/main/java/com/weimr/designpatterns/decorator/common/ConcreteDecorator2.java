package com.weimr.designpatterns.decorator.common;

/**
 * 具体装饰类2
 */
public class ConcreteDecorator2 extends Decorator{
    //定义被修饰者
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    //定义自己的修饰方法
    private void method2(){
        System.out.println("method2 修饰");
    }

    //重写父类的Operation方法
    @Override
    public void operation() {
        //调用父类的方法，可以在调用前后执行一些附加动作
        super.operation();
        this.method2();
    }
}
