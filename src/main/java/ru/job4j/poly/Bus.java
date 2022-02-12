package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("The bus is moving");
    }

    @Override
    public void passengers(int count) {
        System.out.println("There are " + count + " passengers on the bus");
    }

    @Override
    public double fill(double amount) {
        return amount * 1.89;
    }
}
