package com.tregulov.spring_introduction;

public class Test {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();

        Pet pet2 = new Cat();
        pet2.say();
    }
}
