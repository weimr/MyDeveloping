package com.weimr.designpatterns.singleton.logger.achieve.enumachieve;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单利-枚举
 */
public enum IdGenerator {

    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
