package com.weimr.designpatterns.factory.abstractfactory;

import com.weimr.designpatterns.factory.IRuleConfigParser;

public interface IConfigParserFactory {

    IRuleConfigParser createRuleParser();

    ISystemConfigParser createSystemParser();
}
