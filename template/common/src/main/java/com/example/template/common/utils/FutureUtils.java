package com.example.template.common.utils;

import com.google.common.util.concurrent.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

public class FutureUtils {

    private static Logger logger;

    private static ListeningExecutorService service;

    public static void init(){
        if(logger == null){
            logger = LoggerFactory.getLogger(FutureUtils.class);
        }
        if(service == null){
            service = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
        }
    }

    public static ListenableFuture<?> submit(Runnable var1){
        return service.submit(var1);
    }

    public static <T> ListenableFuture<T> submit(Callable<T> task){
        return service.submit(task);
    }

    public static <T> ListenableFuture<T> submit(Callable<T> task, FutureCallback<T> callback){
        ListenableFuture<T> future = service.submit(task);
        Futures.addCallback(future,callback,service);
        return future;
    }

}
