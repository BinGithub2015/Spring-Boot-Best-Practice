package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

@Aspect
@Component
@Order(2)
public class AuthAspect {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name="stringRedisTemplate")
    ValueOperations<String,String> valOpsStr;

    @Pointcut("execution(public * com.example.demo.controller.*.*.*(..))")
    public void auth() {
    }

    @Before("auth()")
    public void before(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Cookie[] cookies = attributes.getRequest().getCookies();
        for (Cookie cookie:cookies) {
            if(cookie.getName().equals("user_uuid")){
                String uuid = cookie.getValue();
                valOpsStr.get("user:");
            }
        }
        //todo：权限判断
        System.out.println("权限判断");

    }

}
