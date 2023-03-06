package com.hyh.proxy.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("aspectTest")
@org.aspectj.lang.annotation.Aspect
public class Aspect {

    //前置通知
    @Before("execution(* com.hyh.proxy.anno.*.*(..))")
    public void  beforeMethod(){
        System.out.println("runing");
    }

    @After("execution(* com.hyh.proxy.anno.*.*(..))")
    public void eat(){
        System.out.println("aop...eat...");
    }
}
