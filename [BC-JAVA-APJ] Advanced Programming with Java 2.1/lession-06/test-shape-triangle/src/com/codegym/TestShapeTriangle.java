package com.codegym;

public class TestShapeTriangle {
    public static void main(String[] args) {
        Shape shape = new Shape();//mặc định lóp cha
        System.out.println(shape.toString());
        shape = new Shape("green",true);//sau khi truyền vào giá trị
        shape.setFilled(false);
        System.out.println(shape.toString());
        shape = new Triangle();//mặc định lớp con
        System.out.println(shape.toString());
        ((Triangle)shape).setSide123(3,5,2,"green",true);//sau khi truyền vào giá trị
        System.out.println(((Triangle)shape).toString());
    }
}
