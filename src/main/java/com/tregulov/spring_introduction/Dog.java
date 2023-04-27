package com.tregulov.spring_introduction;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Бин собаки создан");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}
