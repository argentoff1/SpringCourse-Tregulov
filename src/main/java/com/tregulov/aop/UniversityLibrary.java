package com.tregulov.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("Берем книгу из University Library " + book.getName());
    }

    /*public void returnBook() {
        System.out.println("Мы возвращаем книгу в University Library");
    }*/

    public void getMagazine() {
        System.out.println("Берем журнал из University Library");
    }
}
