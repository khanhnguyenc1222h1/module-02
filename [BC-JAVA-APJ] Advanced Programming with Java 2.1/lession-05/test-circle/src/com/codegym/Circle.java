package com.codegym;

public class Circle {
    private double radius;
    private String color;
    Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    Circle(double r){
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public String displayCircle(){
        return radius + " " + color;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
