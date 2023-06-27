package com.weimr.designpatterns.proxy.inherit;

import com.weimr.designpatterns.proxy.MetricsCollector;
import com.weimr.designpatterns.proxy.RequestInfo;
import com.weimr.designpatterns.proxy.UserVo;

public class InheritProxy extends UserController{
    private MetricsCollector metricsCollector;

    public InheritProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        UserVo userVo = super.login(telephone, password);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        UserVo userVo = super.register(telephone, password);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return userVo;
    }

    public static void main(String[] args) {
        InheritProxy inheritProxy = new InheritProxy();
        inheritProxy.login("123", "123");
        inheritProxy.register("123", "123");
    }
}
