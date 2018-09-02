package com.example.template.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author
 */
@Aspect
@Component
@Slf4j
@Order(2)
public class AuthAspect {



}
