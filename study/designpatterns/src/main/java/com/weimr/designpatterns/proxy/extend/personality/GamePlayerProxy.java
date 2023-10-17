package com.weimr.designpatterns.proxy.extend.personality;

/**
 * @author weimr
 * @title 代理类
 * @date 2023/10/17
 */
public class GamePlayerProxy implements IGamePlayer, IProxy{
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }
    //代练登陆
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    //代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
