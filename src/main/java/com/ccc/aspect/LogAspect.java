package com.ccc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by ccc on 2017/6/6.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.ccc.annotation.Log)")
    private void log() {
    }

    @Around("log()")
    public void advice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("环绕通知之开始");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("环绕通知之结束");
    }
}
