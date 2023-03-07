package com.codegym;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(2,"yellow");
        System.out.println(circle.toString());
        circle = new Cylinder(3, "red", 4);
        System.out.println(circle.toString());
    }
}
