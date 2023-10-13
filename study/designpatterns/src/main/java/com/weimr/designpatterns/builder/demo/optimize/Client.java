package com.weimr.designpatterns.builder.demo.optimize;

import java.util.ArrayList;

/**
 * @author weimr
 * @title 场景类
 * @date 2023/10/12
 */
public class Client {
    public static void main(String[] args) {
        /*
         * 客户告诉XX公司，我要这样一个模型，然后XX公司就告诉我老大说要这样一个模型，这样一个顺序，然后我就来制造
         */
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");//客户要求，run的时候先发动引擎
        sequence.add("start");//启动起来
        sequence.add("stop");//开了一段就停下来
        //要一辆奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一辆奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();
        //按照相同的顺序，制造一辆宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();
    }
}
