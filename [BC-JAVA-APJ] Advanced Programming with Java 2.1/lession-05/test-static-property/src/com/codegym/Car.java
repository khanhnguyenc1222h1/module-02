package com.codegym;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;//static lấy bộ nhớ chỉ 1 lần
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
