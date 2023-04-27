package com.tregulov.spring_introduction;

public class Cat  implements Pet {
    public Cat() {
        System.out.println("Бин кошки создан");
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
