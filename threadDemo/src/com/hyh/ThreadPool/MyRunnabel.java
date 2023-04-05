package com.hyh.ThreadPool;

public class MyRunnabel implements Runnable {
    @Override
    public void run() {
        System.out.println("自定义线程池" + Thread.currentThread().getName());
    }
}
