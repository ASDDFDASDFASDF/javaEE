package com.hyh.callableDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable c1 = new MyCallable();
        FutureTask task = new FutureTask(c1);
        new Thread(task).start();

        String str  = (String) task.get();
        System.out.println(str);
    }
}
