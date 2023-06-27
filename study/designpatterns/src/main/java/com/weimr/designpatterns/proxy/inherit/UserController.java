package com.weimr.designpatterns.proxy.inherit;

import com.weimr.designpatterns.proxy.UserVo;
import com.weimr.designpatterns.proxy.combination.IUserController;

public class UserController implements IUserController {
    @Override
    public UserVo login(String telephone, String password) {
        return null;
    }

    @Override
    public UserVo register(String telephone, String password) {
        return null;
    }
}
