package com.ankit.spring.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component

public class CRMLoggingAspect {

    // setup logger

    private Logger myLogger= LoggerFactory.getLogger(getClass().getName());
    // setup pointcut declarations.

    @Pointcut("execution(* com.ankit.spring.demo.controller.*.*(..))")
    public void forControllerPackage(){};

    @Pointcut("execution(* com.ankit.spring.demo.service.*.*(..))")
    public void forServicePackage(){};

    @Pointcut("execution(* com.ankit.spring.demo.dao.*.*(..))")
    public void forDaoPackage(){};

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    public void forAppFlow(){};

    // add @Before advice.

    @Before("forAppFlow()")
    public void before (JoinPoint theJoinPoint){

        // display method we are calling.

        String method= theJoinPoint.getSignature().toShortString();

        myLogger.info("In @Before Calling method: "+method);

        // display the arguments to the method.

        Object[] args= theJoinPoint.getArgs();

        // loop through and display args.

        for(Object tempArg:args){
            myLogger.info(" argument: "+tempArg);
        }

    }
    // add @AfterReturning advice.

    @AfterReturning(pointcut="forAppFlow()",returning = "theResult")
    public void afterReturning(JoinPoint theJoinPoint,Object theResult){

        // display method we are calling.

        String method= theJoinPoint.getSignature().toShortString();

        myLogger.info("In @AfterReturning Calling method: "+method);

        // display data returned.

        myLogger.info("result: "+theResult);

    }


}
