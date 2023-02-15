package com.hyh.callableDemo;

import java.util.concurrent.Callable;

//这个可以获取到线程的返回值信息
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        return "答应";
    }
}
