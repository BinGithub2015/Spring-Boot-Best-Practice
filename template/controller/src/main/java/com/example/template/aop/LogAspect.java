package com.example.template.aop;

import com.example.template.common.model.response.Response;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

/**
 * @author bin
 */
@Aspect
@Component
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Around("execution(public * com.example.template.controller.*.*(..))")
    public void log(ProceedingJoinPoint point){
        try {
            Object[] args = point.getArgs();
            for (Object arg:args) {

            }
            Response response = (Response) point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

}
