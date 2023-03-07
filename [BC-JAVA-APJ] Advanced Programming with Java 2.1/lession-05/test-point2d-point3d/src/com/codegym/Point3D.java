package com.codegym;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    Point3D(){
    }
    Point3D(float a, float b, float c){
        super(a,b);
        this.z = c;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float c){
        this.z = c;
    }
    public void setXYZ(float a, float b, float c){
        super.setXY(a,b);
        this.z = c;
    }
    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = this.z;
        return arr;
    }
    public String toString(){
        return Arrays.toString(getXYZ());
    }
}
