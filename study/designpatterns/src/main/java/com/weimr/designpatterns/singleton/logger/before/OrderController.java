package com.weimr.designpatterns.singleton.logger.before;

import java.io.IOException;

public class OrderController {

    private Logger logger = new Logger();

    public OrderController() throws IOException {
    }

    public void create(String order) throws Exception {
        // ...省略业务逻辑代码...
        logger.log("Created an order: " + order);
    }
}
