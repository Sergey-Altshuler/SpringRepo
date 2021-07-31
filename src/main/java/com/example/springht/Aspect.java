package com.example.springht;

public class Aspect {
    public void before() {
        System.out.println("Сейчас будет вызван метод send");
    }

    public void after() {
        System.out.println("Был вызван метод send");
    }

    public void throwExc() {
        System.out.println("Была сгенерирована ошибка");
    }
}
