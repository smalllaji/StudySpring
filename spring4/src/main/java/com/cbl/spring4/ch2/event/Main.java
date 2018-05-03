package com.cbl.spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = (DemoPublisher) context.getBean("demoPublisher");
        demoPublisher.publish("发布消息，买耳机");
        context.close();
    }
}
