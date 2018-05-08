package com.cbl.spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsynTaskService asynTaskService = context.getBean(AsynTaskService.class);
        for (int i =0; i<10 ; i++){
            asynTaskService.executeAsyncTask(i);
            asynTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
