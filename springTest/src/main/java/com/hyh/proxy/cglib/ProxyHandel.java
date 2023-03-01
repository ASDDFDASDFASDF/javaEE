package com.hyh.proxy.cglib;

import com.hyh.proxy.jdk.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandel {
    public static void main(String[] args) {
        //创建增强器
        Enhancer enhancer = new Enhancer();
        final ProxyJDK jdk = new ProxyJDK();
        final UserServiceImpl us = new UserServiceImpl();
        //设置父类
        enhancer.setSuperclass(us.getClass());

        //设置回调
        enhancer.setCallback(new MethodInterceptor(){
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                jdk.eat();
                Object invoke = method.invoke(us, objects);
                jdk.heshui();
                return invoke;
            }
        });
        //创建代理对象
        UserServiceImpl o = (UserServiceImpl) enhancer.create();
        o.run();

    }
}
