package com.example.template.common.utils;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ListenableFuture;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;


public class FutureUtilsTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static boolean flag = true;

    @Test
    public void submit() throws ExecutionException, InterruptedException {


        FutureUtils.init();
        ListenableFuture f1 = FutureUtils.submit(() -> System.out.println("this is runnable"));

        System.out.println("end  1");

        System.out.println("-----------");

        ListenableFuture<Boolean> f2 = FutureUtils.submit(() -> {
                    Thread.sleep(7000);
                    System.out.println("this is callable");
                    return true;
                }
        );

        logger.debug("end  2");
        logger.debug("result:{}", f2.get());

        System.out.println("-----------");

        ListenableFuture<Boolean> f3 = FutureUtils.submit(() -> {
            logger.debug("this is callable");
            return false;
        }, new FutureCallback<Boolean>() {
            @Override
            public void onSuccess(@Nullable Boolean aBoolean) {
                logger.debug("onSuccess:{}", aBoolean);
            }

            @Override
            public void onFailure(Throwable throwable) {
                logger.debug(throwable.getMessage());

            }
        });

        logger.debug("end  3");
        //阻塞
        logger.debug("result:{}", f3.get());

    }
}