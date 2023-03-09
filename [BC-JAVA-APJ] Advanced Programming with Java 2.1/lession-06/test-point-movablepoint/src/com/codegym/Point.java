package com.codegym;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;
    Point(float a, float b){
        this.x = a;
        this.y = b;
    }
    Point(){}
    public float getX(){
        return this.x;
    }
    public void setX(float a){
        this.x = a;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float b){
        this.y = b;
    }
    public void setXY(float a, float b){
        this.x = a;
        this.y = b;
    }
    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }
    public String toString(){
        return Arrays.toString(getXY());
    }
}
