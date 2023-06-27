package com.weimr.designpatterns.proxy.combination;

import com.weimr.designpatterns.proxy.UserVo;

public interface IUserController {

    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}
