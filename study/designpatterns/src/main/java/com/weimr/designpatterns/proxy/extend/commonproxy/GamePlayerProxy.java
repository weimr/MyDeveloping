package com.weimr.designpatterns.proxy.extend.commonproxy;

public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name){
        try {
            this.gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    //代练杀怪
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    //代练登录
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    //代练升级
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
