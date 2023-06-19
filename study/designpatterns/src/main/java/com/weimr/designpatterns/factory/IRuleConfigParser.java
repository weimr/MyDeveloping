package com.weimr.designpatterns.factory;

import com.weimr.designpatterns.factory.simple.RuleConfig;

public interface IRuleConfigParser {

    RuleConfig parse(String configText);
}
