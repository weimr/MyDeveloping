package com.weimr.designpatterns.bridge.demo;

/**
 * 桥接模式
 */
public class BridgeTest {

    public static void main(String[] args) {

    }
}

//实现化角色
interface Implementor {

    void operationImpl();
}

//具体实现化角色
class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("具体实现化（Concrete Implementor）角色被访问");
    }
}

//抽象化角色
abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void operation();
}

//扩展抽象化角色
class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        System.out.println("扩展抽象化（Refined Abstraction）角色被访问");
        implementor.operationImpl();
    }
}