package com.example.java8_study.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> System.out.println("Thread Name: " + Thread.currentThread().getName()));

        executorService.shutdown();
    }
//    public static void main(String[] args) {
//        MyThead myThead = new MyThead();
//        myThead.start();
//
//        // Java8Way
//        Thread thread = new Thread(() -> {
//            try {
//                Thread.sleep(1000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Thread name: " + Thread.currentThread().getName());
//        });
//        thread.start();
//
//        System.out.println("Hello:" + Thread.currentThread().getName());
//    }
//
//    // Thread를 만드는 힘든 방법
//    static class MyThead extends Thread {
//        @Override
//        public void run() {
//            System.out.println("Thread name: " + Thread.currentThread().getName());
//        }
//    }
}
