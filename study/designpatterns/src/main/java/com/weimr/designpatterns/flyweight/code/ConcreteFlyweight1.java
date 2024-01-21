package com.weimr.designpatterns.flyweight.code;

/**
 * 具体享元角色1
 */
public class ConcreteFlyweight1 extends Flyweight {
    //接受外部状态
    public ConcreteFlyweight1(String _extrinsic) {
        super(_extrinsic);
    }
    @Override
    public void operate() {
        //业务逻辑
    }
}
