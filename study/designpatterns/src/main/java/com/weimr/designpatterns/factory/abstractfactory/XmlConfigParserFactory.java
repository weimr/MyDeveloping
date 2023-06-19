package com.weimr.designpatterns.factory.abstractfactory;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.XmlRuleConfigParser;

public class XmlConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
