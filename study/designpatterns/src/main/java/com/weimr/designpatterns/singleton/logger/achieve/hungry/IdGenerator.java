package com.weimr.designpatterns.singleton.logger.achieve.hungry;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单利-饿汉式
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
