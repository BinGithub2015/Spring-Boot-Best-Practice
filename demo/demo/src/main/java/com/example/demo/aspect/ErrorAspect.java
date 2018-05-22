package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ErrorAspect {

    @Pointcut("execution(public * com.example.demo.controller.*.*.*(..))")
    public void error() {
    }

    //todo:记录错误，使切面传递有顺序

}
