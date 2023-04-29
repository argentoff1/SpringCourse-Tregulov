package com.tregulov.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Берем книгу из University Library");
        System.out.println("---------------------------------------");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в University Library");
        System.out.println("---------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Берем журнал из University Library");
        System.out.println("---------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в University Library");
        System.out.println("---------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в University Library");
        System.out.println("---------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в University Library");
        System.out.println("---------------------------------------");
    }
}
