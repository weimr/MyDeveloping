package com.weimr.designpatterns.singleton.logger.achieve.staticinner;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单利-静态内部类
 * instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private IdGenerator() {}

    private static class SingletonHolder {
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
