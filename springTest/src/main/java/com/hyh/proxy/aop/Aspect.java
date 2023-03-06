package com.hyh.proxy.aop;

public class Aspect {

    public void  beforeMethod(){
        System.out.println("runing");
    }

    public void eat(){
        System.out.println("aop...eat...");
    }
}
