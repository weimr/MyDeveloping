package com.weimr.designpatterns.builder.demo.one;

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
        BenzModel benz = new BenzModel();
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");//客户要求，run的时候先发动引擎
        sequence.add("start");//启动起来
        sequence.add("stop");//开了一段就停下来
        //我们把这个顺序赋予奔驰车
        benz.setSequence(sequence);
        benz.run();
    }
}
