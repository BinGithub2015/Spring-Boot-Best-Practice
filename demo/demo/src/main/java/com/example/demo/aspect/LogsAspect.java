package com.example.demo.aspect;

import com.example.demo.controller.base.Response;
import com.example.demo.controller.base.StateCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class LogsAspect {

    @Pointcut("execution(public * com.example.demo.controller.*.*.*(..))")
    public void logs() {
    }

    //todo:记录传入的url和参数，记录传出的结果，和时间
    @Around("logs()")
    public Response around(ProceedingJoinPoint jp) {
        Response rep;
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            String uri = attributes.getRequest().getRequestURI();
            System.out.println(uri);
            rep = (Response) jp.proceed();
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(rep);
            System.out.println(jsonString);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            rep = new Response(StateCode.FAIL.name(), StateCode.FAIL.ordinal(), throwable.getMessage());
        }
        return rep;
    }


}
