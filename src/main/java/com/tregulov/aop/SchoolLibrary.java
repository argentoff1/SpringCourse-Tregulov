package com.tregulov.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    //@Override
    public void getBook() {
        System.out.println("Берем книгу из School Library");
    }
}
