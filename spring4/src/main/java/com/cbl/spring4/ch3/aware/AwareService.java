package com.cbl.spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {

    private String beanName;

    private ResourceLoader loader;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名字是："+this.beanName);
        Resource resource = loader.getResource("classpath:com/cbl/spring4/ch3/aware/test.txt");
        //Resource resource = loader.getResource("classpath:com/cbl/spring4/ch3/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容是："+ IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
