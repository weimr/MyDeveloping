package com.weimr.designpatterns.singleton.logger.after;

public class UserController {

    private void login(String username, String password) {
        // ...省略业务逻辑代码...
        Logger.getInstance().log(username + " logined!");
    }
}
