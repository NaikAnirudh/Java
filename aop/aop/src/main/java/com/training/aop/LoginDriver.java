package com.training.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/*
Using @Aspect annotation to attach the advices to the methods present in Login Class
 */
@Aspect
public class LoginDriver {

    //@Pointcut selects one or more join points where advice is executed
    @Pointcut("execution(* Login.*(..))")
    public void advice(){}

    //@Before executes the advice before the method
    @Before("advice()")
    public void concern1(JoinPoint joinPoint){
        System.out.println("Validating User!!!");
    }

    //@After executes the advice after the method
    @After("advice()")
    public void concern2(JoinPoint joinPoint){
        System.out.println("Processing Further Transaction!!!!!");
    }
}
