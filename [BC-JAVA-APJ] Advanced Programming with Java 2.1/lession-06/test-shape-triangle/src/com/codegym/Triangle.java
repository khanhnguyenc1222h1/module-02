package com.codegym;

public class Triangle extends Shape{
    private double side1,side2,side3;
    Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    Triangle(double side1, double side2, double side3, String color, boolean filled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide1(){
        return this.side1;
    }public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }
    public void setSide123(double side1, double side2, double side3, String color, boolean filled ){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getArea(){
        double halfPerimeter = getPerimeter()/2;
        double heightSide1 =  (2*Math.sqrt(halfPerimeter*((halfPerimeter-getSide1())*(halfPerimeter-getSide2())*(halfPerimeter-getSide3()))))/getSide1();
        return (getSide1()*heightSide1)/2;
    }
    public double getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }
    public String toString(){
        return "side1: "+getSide1()+
                "   side2: "+getSide2()+
                "   side3: "+getSide3()+
                "   Area: "+getArea()+
                "   Perimeter: "+getPerimeter()+
                "   Shape: "+super.toString();
    }
}
