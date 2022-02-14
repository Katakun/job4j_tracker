package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.print("Еду по рельсам ");
    }

    @Override
    public int speed() {
        return 200;
    }
}
