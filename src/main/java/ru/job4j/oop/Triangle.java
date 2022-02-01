package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter() {
        double sp = (first.distance(second) + second.distance(third) + third.distance(first)) / 2;
        return sp;
    }

    public boolean exist(double ab, double ac, double bc) {
        boolean exist = (first.distance(second) + second.distance(third)) > third.distance(first)
                && (second.distance(third) + third.distance(first)) > first.distance(second)
                && (third.distance(first) + first.distance(second)) > second.distance(third);
        return exist;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter();
            rsl = sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
}