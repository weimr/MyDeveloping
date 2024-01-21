package com.weimr.designpatterns.flyweight.code;

/**
 * 具体享元角色2
 */
public class ConcreteFlyweight2 extends Flyweight {
    //接受外部状态
    public ConcreteFlyweight2(String _extrinsic) {
        super(_extrinsic);
    }
    @Override
    public void operate() {
        //业务逻辑
    }
}
