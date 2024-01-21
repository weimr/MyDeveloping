package com.weimr.designpatterns.flyweight.extend.threadsafe;


import java.util.HashMap;

/**
 * 享元工厂
 */
public class SignInfoFactory {
    //池容器
    private static HashMap<ExtrinsicState, SignInfo> pool = new HashMap<ExtrinsicState, SignInfo>();
    //从池中获得对象
    public static SignInfo getSignInfo(ExtrinsicState key) {
        //设置返回对象
        SignInfo result = null;
        //池中没有该对象，则建立，并放入池中
        if(!pool.containsKey(key)) {
            result = new SignInfo();
            pool.put(key, result);
        }
        return result;
    }
}
