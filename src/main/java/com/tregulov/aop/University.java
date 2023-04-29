package com.tregulov.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("university")
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Maxim Parinos", 3, 4.7);
        Student student2 = new Student("Alexander Sidorov", 2, 5);
        Student student3 = new Student("Ruslan Mamenko", 1, 3.9);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(0));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
