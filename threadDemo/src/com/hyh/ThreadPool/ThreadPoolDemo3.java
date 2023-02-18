package com.hyh.ThreadPool;

import com.hyh.callableDemo.MyCallable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//自定义线程池类
public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        //1.初始化线程池数量
        //2.最大线程数量
        //3.线程空闲清除时间(值)
        //4.线程空闲清楚时间（单位）
        //5.阻塞队列（线程任务排队数量）
        //6.线程创建方式
        //7.线程数量超出时任务的拒绝策略
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                3,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 20; i++) {
            threadPoolExecutor.submit(new MyRunnabel());
        }

//        threadPoolExecutor.submit( () -> {
//            try {
//                String call = new MyCallable().call();
//                System.out.println(call);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
        threadPoolExecutor.shutdown();

    }
}
