package com.example.template.common.utilities;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.concurrent.*;

public class FutureUtiltiles {

    private final static ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());



    public static <T> ListenableFuture<T> submit(Callable<T> task){
        return service.submit(task);
    }


}
