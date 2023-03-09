package com.codegym;

public class Circle {
    private double radius;
    private String color;
    Circle(){
    }
    Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color = c;
    }
    public double getArea(){
        return 3.14*Math.pow(radius,2);
    }
    @Override
    public String toString(){
        return "Area: " + getArea()+"   Radius: "+getRadius()+"     Color: "+getColor();
    }
}
