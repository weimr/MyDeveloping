package com.weimr.designpatterns.flyweight.extend.threadsafe;

import com.weimr.designpatterns.flyweight.demo.optimize.SignInfoFactory;

/**
 * 场景类2：以String类型作为外部状态的运行时间
 */
public class Client2 {
    public static void main(String[] args) {
        String key1 = "科目1上海";
        String key2 = "科目2上海";
        //初始化对象池
        SignInfoFactory.getSignInfo(key1);
        //计算执行100万次需要的时间
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SignInfoFactory.getSignInfo(key1);
        }
        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (tailTime - currentTime) + "ms");
    }
}
