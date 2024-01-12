package com.weimr.designpatterns.state.demo.optimize;

/**
 * 场景类
 * @author weimr
 * @date 2024/01/09
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
