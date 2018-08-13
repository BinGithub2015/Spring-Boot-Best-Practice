package com.example.template.concurrent;

import com.google.common.util.concurrent.FutureCallback;
import org.slf4j.LoggerFactory;

public class DemoCallback implements FutureCallback<String> {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(DemoCallback.class);

    @Override
    public void onSuccess(String str) {
        logger.debug("callbakc:{}",str);
    }

    @Override
    public void onFailure(Throwable throwable) {

    }
}
