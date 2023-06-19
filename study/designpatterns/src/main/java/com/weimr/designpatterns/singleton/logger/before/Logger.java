package com.weimr.designpatterns.singleton.logger.before;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("/Users/wangzheng/log.txt");
        this.writer = new FileWriter(file, true); //true表示追加写入
    }

    public void log(String message) throws Exception {
        writer.write(message);
    }
}
