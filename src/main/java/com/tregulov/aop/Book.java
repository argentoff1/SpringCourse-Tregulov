package com.tregulov.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Идиот")
    private String name;

    public String getName() {
        return name;
    }
}
