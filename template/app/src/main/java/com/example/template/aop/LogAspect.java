package com.example.template.aop;

import com.example.template.common.model.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

/**
 * @author bin
 */
@Aspect
@Component
@Slf4j
public class LogAspect {

    @Pointcut("execution(public * com.example.template.controller.*.*(..))")
    public void log(){}

    @Around("log()")
    public void log(ProceedingJoinPoint point){
        try {
            Object[] args = point.getArgs();
            for (Object arg:args) {
                log.info("log:{}",arg);
            }
            Response response = (Response) point.proceed();
            log.info("response:{}",response);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            log.error("log:{}",throwable);
        }

    }

}
