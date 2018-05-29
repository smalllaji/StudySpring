package com.cbl.spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.cbl.spring4.ch3.taskscheduler")
@EnableScheduling//注解开启对计划任务的支持
public class TaskSchedulerConfig {
}
