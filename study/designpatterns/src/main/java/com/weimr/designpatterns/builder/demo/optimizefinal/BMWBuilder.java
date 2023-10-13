package com.weimr.designpatterns.builder.demo.optimizefinal;

import java.util.ArrayList;

/**
 * @author weimr
 * @title 宝马车组装者
 * @date 2023/10/12
 */
public class BMWBuilder extends CarBuilder{
    private BMWModel bwm = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bwm.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bwm;
    }
}
