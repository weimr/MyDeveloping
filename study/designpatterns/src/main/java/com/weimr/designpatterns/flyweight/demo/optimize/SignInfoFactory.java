package com.weimr.designpatterns.flyweight.demo.optimize;

import java.util.HashMap;

/**
 * 带对象池的工厂类
 */
public class SignInfoFactory {
    //池容器
    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
    //报名信息的对象工厂
    //从池中获得对象
    public static SignInfo getSignInfo(String key) {
        //设置返回对象
        SignInfo result = null;
        //池中没有该对象，则建立，并放入池中
        if (!pool.containsKey(key)) {
            System.out.printf(key + "----建立对象，并纺织到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.printf(key + "----直接从池中取得");
        }
        return result;
    }
}
