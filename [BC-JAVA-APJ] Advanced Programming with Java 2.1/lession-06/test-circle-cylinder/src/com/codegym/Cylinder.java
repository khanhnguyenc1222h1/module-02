package com.codegym;

public class Cylinder extends Circle {
    private double height;
    Cylinder(){}
    Cylinder(double r,String c, double h){
        super(r,c);
        this.height = h;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double h){
        this.height = h;
    }
    public double getRoundVolumn(){
        return super.getArea()*getHeight();
    }
    @Override
    public String toString(){
        return "Height: "+getHeight()+"     RoundVolumn: "+getRoundVolumn();
    }
}
