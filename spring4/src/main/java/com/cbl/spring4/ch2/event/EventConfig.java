package com.cbl.spring4.ch2.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//指明该类为配置类
@ComponentScan("com.cbl.spring4.ch2.event")//指明扫描的包
public class EventConfig {
}
