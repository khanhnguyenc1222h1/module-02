package com.codegym;

import java.util.Arrays;

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        point = new Point2D(2,3);
        System.out.println(point.toString());
        point = new Point3D(2,3,4);//hiện tại point đang trong lớp Point2D
        ((Point3D)point).setXYZ(1,3,4);//ép kiểu point từ lớp point2D sang kiểu Point3D
        System.out.println(point.toString());
    }
}
