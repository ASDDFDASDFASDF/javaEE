package com.hyh.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {

        //创建一个设置最大线程数的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        executorService.shutdown();
    }
}
