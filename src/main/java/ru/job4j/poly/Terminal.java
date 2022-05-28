package ru.job4j.poly;

public class Terminal {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = {airplane, train, bus};
        for (Vehicle vehicle: vehicles) {
            vehicle.fillFuel();
            vehicle.move();
        }
    }
}
