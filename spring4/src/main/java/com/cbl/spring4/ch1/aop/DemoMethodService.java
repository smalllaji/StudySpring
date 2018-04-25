package com.cbl.spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("方法式add");
    }
}
