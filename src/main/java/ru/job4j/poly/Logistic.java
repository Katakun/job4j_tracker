package ru.job4j.poly;

public class Logistic {
    public static void main(String[] args) {
        Vehicle boeing767 = new Plane();
        Vehicle il76 = new Plane();
        Vehicle sapsan = new Train();
        Vehicle lastochka = new Train();
        Vehicle paz = new Bus2();
        Vehicle gazel = new Bus2();

        Vehicle[] vehicles = new Vehicle[]{boeing767, il76,
                sapsan, lastochka, paz, gazel};

        for (Vehicle v : vehicles) {
            v.move();
            System.out.println("со скоростью " + v.speed() + " км/ч");
        }
    }
}
