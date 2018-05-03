package com.cbl.spring4.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //spring在创建context容器的时候就已经将配置类中所扫描包下所有的Bean加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PerPostConfig.class);
        context.getBean(BeanWayService.class);
        context.getBean(JSR250WayService.class);
        context.close();
    }
}
