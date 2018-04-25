package com.cbl.spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")//默认为Singleton,不写也可以
public class DemoSingletonService {

}
