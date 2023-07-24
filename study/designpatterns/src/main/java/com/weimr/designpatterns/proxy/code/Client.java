package com.weimr.designpatterns.proxy.code;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
