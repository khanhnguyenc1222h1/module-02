package com.codegym;

import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    MovablePoint(float a, float b, float c, float d){
        super(a,b);
        this.xSpeed = c;
        this.ySpeed = d;
    }
    MovablePoint(float c, float d){
        this.xSpeed = c;
        this.ySpeed = d;
    }
    MovablePoint(){}
    public float getxSpeed(){
        return this.xSpeed;
    }
    public void setxSpeed(float c){
        this.xSpeed = c;
    }
    public float getySpeed(){
        return this.ySpeed;
    }
    public void setySpeed(float d){
        this.ySpeed = d;
    }
    public void setSpeed(float c, float d){
        this.xSpeed = c;
        this.ySpeed = d;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }
    public String toString(){
        return super.toString() + "     speed = "+Arrays.toString(getSpeed());
    }
    public MovablePoint Move(){
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }
}
