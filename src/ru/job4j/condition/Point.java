package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        System.out.println(dist);
        Point c = new Point(3, 0);
        Point d = new Point(6, 8);
        dist = c.distance(d);
        System.out.println(dist);
        Point e = new Point(1, 5);
        Point f = new Point(4, 3);
        dist = e.distance(f);
        System.out.println(dist);
    }
}
