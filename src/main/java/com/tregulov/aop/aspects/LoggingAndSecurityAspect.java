package com.tregulov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.tregulov.aop.UniversityLibrary.*(..))")
    private void allMethodsFromUniLibrary() {}

    @Pointcut("execution(public void com.tregulov.aop.UniversityLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeallMethodsExceptReturnMagazineFromUniLibrary() {
        System.out.println("beforeallMethodsExceptReturnMagazineFromUniLibrary: writing Log #12");
    }

    /*@Pointcut("execution(* com.tregulov.aop.UniversityLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {}

    @Pointcut("execution(* com.tregulov.aop.UniversityLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {}

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodFromUniLibrary() {}

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }*/






    /*@Pointcut("execution(* get*())")
    private void allGetMethods() {}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("метод beforeGetLoggingAdvice: попытка получить книгу или журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги или журнала");
    }*/
}
