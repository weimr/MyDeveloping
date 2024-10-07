package com.weimr.designpatterns.methodfactory.extend.singleton;

import java.lang.reflect.Constructor;

/**
 * @title 负责生成单例的工厂类
 * @author weimr
 * @date 2023/10/09
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class c = Class.forName(Singleton.class.getName());
            //获得无参构造
            Constructor constructor = c.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            //异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
