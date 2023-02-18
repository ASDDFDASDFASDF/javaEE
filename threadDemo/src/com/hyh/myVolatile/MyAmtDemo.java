package com.hyh.myVolatile;

public class MyAmtDemo {
    public static void main(String[] args) {
        MyAmtThreadDemo mtd = new MyAmtThreadDemo();

        for (int i = 0; i < 100; i++) {
            new Thread(mtd).start();
        }
    }
}
