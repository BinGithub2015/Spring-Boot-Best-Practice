package com.example.template.aop;

import com.example.template.common.model.request.Request;
import com.example.template.common.model.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @author bin
 */
@Aspect
@Component
@Slf4j
@Order(1)
public class LogAspect {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Around("execution(public * com.example.template.controller..*..*(..))")
    public Response log(ProceedingJoinPoint point){
        String traceId = String.valueOf(UUID.randomUUID());
        MDC.put("TRACE_ID",traceId);
        String uri = httpServletRequest.getRequestURI();
        String method = httpServletRequest.getMethod();
        Object[] args = point.getArgs();
        Request request = null;
        for (Object arg:args) {
            if(arg instanceof Request){
                request = (Request)arg;
                break;
            }
        }
        Response response = null;
        try {
            response = (Response) point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            log.error("URI:{},METHOD:{},REQUEST:{},THROWABLE",uri,method,request,throwable);
        }
        log.info("URI:{},METHOD:{},REQUEST:{},RESPONSE:{}",uri,method,request,response);
        MDC.clear();
        return response;
    }

}
