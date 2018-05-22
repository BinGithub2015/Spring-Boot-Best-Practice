package com.example.demo.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;

@Aspect
@Component
public class LogsAspect {

    @Pointcut("execution(public * com.example.demo.controller.*.*.*(..))")
    public void logs() {
    }

    //todo:记录传入的url和参数，记录传出的结果，和时间
    @Around("logs()")
    public void around(){

    }


}
