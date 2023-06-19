package com.weimr.designpatterns.factory.method;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
