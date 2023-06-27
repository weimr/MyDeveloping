package com.weimr.designpatterns.proxy;

public class MetricsCollector {

    public void recordRequest(RequestInfo requestInfo) {
        System.out.println("recordRequest");
    }
}
