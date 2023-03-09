package com.codegym;

public class TestPointMovablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point = new Point(2,4);
        System.out.println(point.toString());
        point = new MovablePoint(1, 2, 3,5);
        System.out.println(point.toString());
        System.out.println(((MovablePoint)point).Move());

    }
}
