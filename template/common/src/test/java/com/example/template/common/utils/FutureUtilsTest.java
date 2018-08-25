package com.example.template.common.utils;

import com.google.common.util.concurrent.ListenableFuture;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;


public class FutureUtilsTest {

    private static boolean flag = true;

    @Test
    public void submit() throws ExecutionException, InterruptedException {


        FutureUtils.init();
        ListenableFuture f1 = FutureUtils.submit(() -> System.out.println("this is runnable"));

        System.out.println("end  1");

        while (!f1.isDone()) {
            System.out.printf("state:{}", f1.get());
        }

        System.out.println("-----------");

        ListenableFuture<Boolean> f2 = FutureUtils.submit(() -> {
                    System.out.println("this is callable");
                    return true;
                }
        );



        System.out.println("end  2");
        while (!f2.isDone()) {
            System.out.printf("state:{}", f2.get());
        }
        System.out.println();
        System.out.printf("result:{}",f2.get());
        System.out.printf(f2.get().toString());


//
//        Futures.addCallback(booleanTask, new FutureCallback<Boolean>() {
//            @Override
//            public void onSuccess(Boolean result) {
//                System.err.println("BooleanTask: " + result);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//            }
//        });
//
//        // 任务2
//        ListenableFuture<String> stringTask = FutureUtils.submit(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "Hello World";
//            }
//        });
//
//        Futures.addCallback(stringTask, new FutureCallback<String>() {
//            @Override
//            public void onSuccess(String result) {
//                System.err.println("StringTask: " + result);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//            }
//        });
//
//        // 任务3
//        ListenableFuture<Integer> integerTask = FutureUtils.submit(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                return new Random().nextInt(100);
//            }
//        });
//
//        Futures.addCallback(integerTask, new FutureCallback<Integer>() {
//            @Override
//            public void onSuccess(Integer result) {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.err.println("IntegerTask: " + result);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//            }
//        });
//
//        // 执行时间
//        System.err.println("time: " + (System.currentTimeMillis() - t1));

    }
}