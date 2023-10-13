package com.weimr.designpatterns.builder.demo.optimize;

import java.util.ArrayList;

/**
 * @author weimr
 * @title 奔驰车组装者
 * @date 2023/10/12
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
