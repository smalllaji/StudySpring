package com.cbl.spring4.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService bean = context.getBean(ListService.class);
        String cmd = bean.showListCmd();
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下命令为："+cmd);

    }
}
