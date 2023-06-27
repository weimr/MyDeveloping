package com.weimr.designpatterns.proxy.dynamic;

import com.weimr.designpatterns.proxy.MetricsCollector;
import com.weimr.designpatterns.proxy.RequestInfo;
import com.weimr.designpatterns.proxy.combination.IUserController;
import com.weimr.designpatterns.proxy.combination.UserController;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy {
    private MetricsCollector metricsCollector;

    public DynamicProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, dynamicProxyHandler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTimestamp = System.currentTimeMillis();
            Object result = method.invoke(proxiedObject, args);
            long endTimeStamp = System.currentTimeMillis();
            long responseTime = endTimeStamp - startTimestamp;
            String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
            RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTimestamp);
            metricsCollector.recordRequest(requestInfo);
            return result;
        }
    }

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
        userController.login("123", "123");
    }
}
