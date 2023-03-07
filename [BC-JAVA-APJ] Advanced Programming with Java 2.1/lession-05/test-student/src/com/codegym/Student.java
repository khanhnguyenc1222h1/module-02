package com.codegym;

public class Student {
    private String name;
    private String Class;
    Student(){
        this.name = "Jonh";
        this.Class = "C02";
    }
    public void setName(String n){
        this.name = n;
    }
    public void setClass(String c){
        this.Class = c;
    }
    public void display(){
        System.out.println(this.name+" "+this.Class);
    }
}
