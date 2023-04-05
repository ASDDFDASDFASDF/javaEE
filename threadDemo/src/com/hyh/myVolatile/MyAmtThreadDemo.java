package com.hyh.myVolatile;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAmtThreadDemo implements Runnable {
    private int count = 0;

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("当前count数" + count);
        }

    }
}
