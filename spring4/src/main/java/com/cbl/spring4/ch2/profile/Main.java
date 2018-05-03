package com.cbl.spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");//先将活动的Profile置为dev
        context.register(ProfileConfig.class);//然后注册Bean的配置类
        context.refresh();//刷新容器
        //DemoBean demoBean = (DemoBean) context.getBean("devDemoBean");
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
