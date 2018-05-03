package com.cbl.spring4.ch2.prepost;

import com.cbl.spring4.ch2.prepost.BeanWayService;
import com.cbl.spring4.ch2.prepost.JSR250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cbl.spring4.ch2.prepost.test")
public class PerPostConfig {

    //@Bean(initMethod = "init",destroyMethod = "destroy")
    @Bean
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    //@Bean
    @Bean(initMethod = "inittttt",destroyMethod = "destroyyyyy")
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
