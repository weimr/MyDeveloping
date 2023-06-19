package com.weimr.designpatterns.factory.abstractfactory;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.PropertiesRuleConfigParser;

public class PropertiesConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new PropertiesRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new PropertiesSystemConfigParser();
    }
}
