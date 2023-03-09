package com.codegym;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;
    Circle(){
        this.radius = 3.2;
        this.color = "red";
        this.filled = true;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        return "Radius: "+radius+"  "+
                "Color: "+color+"  "+
                "Filled: "+filled;
    }
}
