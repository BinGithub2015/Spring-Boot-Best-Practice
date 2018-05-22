package com.bestpractice.web.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;

@Aspect
@Component
public class BaseAuthAspect {

//    @Autowired
//    private RedisTemplate<String, String> redisTemplate;

    @Pointcut("execution(public * com.bestpractice.web..*.*(..))")
    public void baseAuth() {
    }

    @Before("baseAuth()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Cookie[] cookies = attributes.getRequest().getCookies();
        //todo
        for (Cookie cookie : cookies) {
//            if (cookie.getName().equals("user_uuid")) {
//                String value = redisTemplate.opsForValue().get(cookie.getValue()).toString();
//                if (value == null) attributes.getResponse().sendRedirect("/login.html");
//
//            }
        }
    }
}
