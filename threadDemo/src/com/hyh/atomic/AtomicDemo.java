package com.hyh.atomic;


public class AtomicDemo {

    public static void main(String[] args) {
        AtomicThreadDemo threadDemo = new AtomicThreadDemo();
        for (int i = 0; i < 100; i++) {
            new Thread(threadDemo).start();
        }
    }
}
