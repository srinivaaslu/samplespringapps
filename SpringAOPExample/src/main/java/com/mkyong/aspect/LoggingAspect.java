package com.mkyong.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by 205025 on 7/7/2016.
 */
@Aspect
public class LoggingAspect {

    @Before("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
    public void addBeforeAnnotation(JoinPoint joinPoint){
        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }
}
