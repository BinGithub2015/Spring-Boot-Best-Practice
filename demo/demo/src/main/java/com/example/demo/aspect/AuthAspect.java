package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;

@Aspect
@Component
public class AuthAspect {

    @Pointcut("execution(public * com.example.demo.controller.*.*.*(..))")
    public void auth() {
    }

    @Before("auth()")
    public void before(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Cookie[] cookies = attributes.getRequest().getCookies();
        //todo：权限判断
        System.out.println("权限判断");
    }

}
