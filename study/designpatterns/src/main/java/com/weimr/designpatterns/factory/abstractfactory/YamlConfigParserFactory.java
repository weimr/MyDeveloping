package com.weimr.designpatterns.factory.abstractfactory;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.YamlRuleConfigParser;

public class YamlConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new YamlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new YamlSystemConfigParser();
    }
}
