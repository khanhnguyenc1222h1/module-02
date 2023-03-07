package com.codegym;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.displayCircle()+" | Area: "+ circle.getArea());
        Circle circle1 = new Circle(2);
        System.out.println(circle1.displayCircle()+" | Area: "+ circle1.getArea());
    }
}
