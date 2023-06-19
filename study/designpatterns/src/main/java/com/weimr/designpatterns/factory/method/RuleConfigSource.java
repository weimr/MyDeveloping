package com.weimr.designpatterns.factory.method;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.simple.RuleConfig;

public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new RuntimeException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();
        String configText = "";
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}
