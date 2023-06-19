package com.weimr.designpatterns.factory.abstractfactory;

import com.weimr.designpatterns.factory.simple.RuleConfig;

public interface ISystemConfigParser {

    RuleConfig parse(String configText);
}
