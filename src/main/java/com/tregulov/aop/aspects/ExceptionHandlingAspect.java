package com.tregulov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("com.tregulov.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: ловим/обрабатываем исключение при попытке добавить книгу/журнал");
        System.out.println("---------------------------------------");
    }
}
