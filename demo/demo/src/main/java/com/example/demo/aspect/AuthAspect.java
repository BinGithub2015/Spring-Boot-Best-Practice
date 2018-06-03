//package com.example.demo.aspect;
//
//import com.example.demo.model.User;
//import com.example.demo.service.UserService;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.annotation.Order;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.annotation.Resource;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
//@Aspect
//@Component
//@Order(2)
//public class AuthAspect {
//
//    //@Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    //@Resource(name="stringRedisTemplate")
//    private ValueOperations<String,String> valOpsStr;
//
//    @Autowired
//    private UserService userService;
//
//    @Pointcut("execution(public * com.example.demo.controller.*.*.*(..))")
//    public void auth() {
//    }
//
//    @Before("auth()")
//    public void before(){
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        Cookie[] cookies = request.getCookies();
//        for (Cookie cookie:cookies) {
//            if(cookie.getName().equals("user_uuid")){
//                String uuid = cookie.getValue();
//                String key = "user:" + uuid;
//                String value =  valOpsStr.get(key);
//                Integer id = Integer.valueOf(value);
//                if(id  == null)break;
//                User user = userService.findById(id);
//                if(user == null)break;
//                request.setAttribute("user",user);
//            }
//        }
//        try {
//            attributes.getResponse().sendRedirect("/login.html");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
