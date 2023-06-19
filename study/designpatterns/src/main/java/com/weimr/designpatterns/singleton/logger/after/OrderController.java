package com.weimr.designpatterns.singleton.logger.after;

public class OrderController {

    public void create(String order) {
        // ...省略业务逻辑代码...
        Logger.getInstance().log("Created a order: " + order.toString());
    }
}
