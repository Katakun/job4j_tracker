package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.print("Лечу по воздуху ");
    }

    @Override
    public int speed() {
        return 500;
    }
}
