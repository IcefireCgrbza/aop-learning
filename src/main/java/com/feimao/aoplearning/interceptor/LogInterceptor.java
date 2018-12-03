package com.feimao.aoplearning.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInterceptor {

    @Pointcut("execution(* com.feimao.aoplearning.controller.*.*(..))")
    public void controller(){
    }

    @Before("controller()")
    public void logBeforeExec() {
        System.out.println("before");
    }

    @After("controller()")
    public void logAfterExec() {
        System.out.println("after");
    }

    @AfterReturning("controller()")
    public void logAfterReturning() {
        System.out.println("return");
    }

    //没有返回值
    @AfterThrowing(value = "controller()", throwing = "ex")
    public void logAfterThrowing(Throwable ex) {
        System.out.println("throw");
    }

    @Around("controller()")
    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        Object result = pjp.proceed();
        System.out.println("around after");
        return result;
    }

}
