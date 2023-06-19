package com.weimr.designpatterns.singleton.logger.achieve.dualdetection;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单利-双重检测
 * CPU 指令重排序可能导致在 IdGenerator 类的对象被关键字 new 创建并赋值给 instance 之后，
 * 还没来得及初始化（执行构造函数中的代码逻辑），就被另一个线程使用了，只需要给 instance 成员变量添加 volatile 关键字
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static volatile IdGenerator instance;
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized(IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
