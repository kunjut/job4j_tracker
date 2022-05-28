package ru.job4j.poly;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус едет по трассе");
    }

    @Override
    public void fillFuel() {
        System.out.println("Автобус заправлен дизелем");
    }
}
