package com.hyh.runnableDemo;

public class MyRunnabelDemo1 {
    public static void main(String[] args) {
        MyRunnabel r1 = new MyRunnabel();
        new Thread(r1).start();
    }
}
