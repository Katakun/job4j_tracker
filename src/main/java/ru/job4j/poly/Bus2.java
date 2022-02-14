package ru.job4j.poly;

public class Bus2 implements Vehicle {
    @Override
    public void move() {
        System.out.print("Еду по дороге ");
    }

    @Override
    public int speed() {
        return 50;
    }
}
