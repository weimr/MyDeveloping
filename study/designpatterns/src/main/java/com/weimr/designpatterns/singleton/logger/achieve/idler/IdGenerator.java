package com.weimr.designpatterns.singleton.logger.achieve.idler;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单利-懒汉式
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator() {}
    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
