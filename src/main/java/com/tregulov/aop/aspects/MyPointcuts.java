package com.tregulov.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {}

    @Pointcut("execution(* abc*())")
    public void allGetMethods() {}
}
