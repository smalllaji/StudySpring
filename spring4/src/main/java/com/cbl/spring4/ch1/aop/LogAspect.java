package com.cbl.spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect//通过@Aspect声明一个切面
@Component//通过@Component让此切面成为一个Spring容器管理的Bean
public class LogAspect {

    @Pointcut("execution(* com.cbl.spring4.ch1.aop.DemoMethodService.add(..))")
    public void annotationPointCut(){}
    /*@Pointcut("@annotation(com.cbl.spring4.ch1.aop.Action)")
    public void annotationPointCut(){}
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截,"+ action.name());
    }*/

    //@Before("execution(* com.cbl.spring4.ch1.aop.DemoMethodService.add(..))")
    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截，前"+method.getName());
    }

}
