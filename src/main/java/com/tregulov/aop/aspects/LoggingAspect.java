package com.tregulov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook(com.tregulov.aop.Book))")
    public void beforeGetBookAdvice() {
        System.out.println("метод beforeGetBookAdvice: попытка получить книгу");
    }

    /*@Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("метод beforeReturnBookAdvice: попытка вернуть книгу");
    }*/
}
