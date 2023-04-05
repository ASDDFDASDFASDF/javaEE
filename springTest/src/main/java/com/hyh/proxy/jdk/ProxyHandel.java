package com.hyh.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandel {
    public static void main(String[] args) {
        final UserServiceImpl userService = new UserServiceImpl();
        final ProxyJDK jdk = new ProxyJDK();
        UserService us = (UserService) Proxy.newProxyInstance(
                  userService.getClass().getClassLoader(),
                  userService.getClass().getInterfaces(),
                  new InvocationHandler() {
                      @Override
                      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                          jdk.eat();
                          method.invoke(userService, args);
                          jdk.heshui();
                          return null;
                      }
                  }
        );

        us.run();


    }
}
