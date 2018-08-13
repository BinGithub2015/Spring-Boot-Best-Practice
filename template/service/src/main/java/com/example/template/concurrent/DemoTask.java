package com.example.template.concurrent;

import com.example.template.aop.LogAspect;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

public class DemoTask  implements Callable<String> {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Override
    public String call() throws Exception {
        logger.debug("this is DemoTask");
        return "demo";
    }

}
