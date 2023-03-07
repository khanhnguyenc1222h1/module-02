package com.codegym;

public class TestShapeTriangle {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        shape = new Shape("green",true);
        System.out.println(shape.toString());
        shape = new Triangle();
        System.out.println(shape.toString());
    }
}
