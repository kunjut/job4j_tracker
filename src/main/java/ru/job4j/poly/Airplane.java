package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит");
    }

    @Override
    public void fillFuel() {
        System.out.println("Самолет заправлен керосином");
    }
}
