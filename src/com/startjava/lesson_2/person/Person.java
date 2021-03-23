package com.startjava.lesson_2.person;

public class Person {

    String name = "Vlad";
    String gender = "Male";
    int age = 20;
    int weight = 70;
    int height = 175;

    void move() {
        System.out.println("Вы идете.");
    }

    void run() {
        System.out.println("Вы бежите.");
    }

    boolean learnJava() {
        System.out.println("Вы изучаете Java.");
        return true;
    }

    void speak() {
        System.out.println("Вы говорите.");
    }

    boolean sit() {
        System.out.println("Вы сидите.");
        return true;
    }
}