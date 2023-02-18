package com.hyh.ThreadPool;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {

        //创建一个默认的线程池对象，默认没有线程，最大值是int的最大值
        ExecutorService executorService = Executors.newCachedThreadPool();//获取一个线程池的控制对象

        //默认查看线程池中有没有线程对象，如果有就直接用，没有就重新创建一个。
        executorService.submit( () -> {
            System.out.println(Thread.currentThread().getName());
        });
//        Thread.sleep(2000);
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });

        executorService.shutdown();//关闭线程池

    }
}
