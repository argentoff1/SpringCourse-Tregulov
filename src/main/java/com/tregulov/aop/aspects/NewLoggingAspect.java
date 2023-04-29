package com.tregulov.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    // В Around Advice нужно вручную вызывать target method
    @Around("execution(public String com.tregulov.aop.UniversityLibrary.returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        long begin = System.currentTimeMillis();
        // Вызов метода вручную
        Object targetMethodResult = proceedingJoinPoint.proceed();
        // targetMethodResult = "Отцы и дети";
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
        // Высчитываем время выполнения метода returnBook()
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook" +
                " выполнил работу за " + (end - begin) + " миллисекунд");
        return targetMethodResult;
    }
}
