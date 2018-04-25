package com.cbl.spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cbl.spring4.ch1.aop")
@EnableAspectJAutoProxy//使用@EnableAspectJAutoProxy开启Spring对Aspectj代理的支持
public class AopConfig {

}
