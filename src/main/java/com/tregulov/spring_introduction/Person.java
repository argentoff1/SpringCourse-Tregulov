package com.tregulov.spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person(Pet pet) {
        System.out.println("Бин человека создан");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Бин человека создан");
    }

    public void setPet(Pet pet) {
        System.out.println("В класс Person добавлено животное");
        this.pet = pet;
    }

    public String getSurname() {
        System.out.println("Класс Person: set surname");
        return surname;
    }

    public int getAge() {
        System.out.println("Класс Person: set age");
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Привет, мое любимое животное!");
        pet.say();
    }
}
