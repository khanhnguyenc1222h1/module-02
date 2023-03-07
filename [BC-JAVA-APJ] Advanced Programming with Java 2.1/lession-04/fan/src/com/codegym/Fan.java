package com.codegym;

public class Fan {

    private int speed;
    private boolean on;
    private double radius;
    private String  color;
    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public int setSpeed(int speed){
        return this.speed = speed;
    }
    public boolean setOn(boolean on){
        return this.on = on;
    }
    public double setRadius(double radius){
        return this.radius = radius;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public Fan(){
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    @Override
    public String toString(){
        if(on==true){
            return "speed: "+speed+" color: "+color+" radius: "+radius+" fan is on";
        }else{
            return "speed: "+speed+" color: "+color+" radius: "+radius+" fan is off";
        }
    }
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan Fan1 = new Fan();
        Fan Fan2 = new Fan();
        Fan1.setSpeed(FAST);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);
        System.out.println("Object Fan1: "+Fan1.toString());
        Fan2.setSpeed(MEDIUM);
        System.out.println("Object Fan2: "+Fan2.toString());
    }
}
