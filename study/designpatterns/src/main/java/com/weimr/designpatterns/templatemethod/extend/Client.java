package com.weimr.designpatterns.templatemethod.extend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("----------悍马H1----------");
        System.out.println("H1型号是否需要喇叭？0-不需要  1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1Model hummerH1Model = new HummerH1Model();
        if (type.equals("0")) {
            hummerH1Model.setAlarm(false);
        }
        hummerH1Model.run();
        System.out.println("----------悍马H2----------");
        HummerH2Model hummerH2Model = new HummerH2Model();
        hummerH2Model.run();
    }
}
