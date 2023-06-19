package com.weimr.designpatterns.singleton.logger.before;

import java.io.IOException;

/**
 * Logger类的应用示例
 */
public class UserController {

    private Logger logger = new Logger();

    public UserController() throws IOException {
    }

    public void login(String username, String password) throws Exception {
        // ...省略业务逻辑代码...
        logger.log(username + " logined!");
    }
}
