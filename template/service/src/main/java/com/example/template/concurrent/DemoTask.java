package com.example.template.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

@Slf4j
public class DemoTask  implements Callable<String> {

    @Override
    public String call() throws Exception {
        log.debug("this is DemoTask");
        return "demo";
    }

}
