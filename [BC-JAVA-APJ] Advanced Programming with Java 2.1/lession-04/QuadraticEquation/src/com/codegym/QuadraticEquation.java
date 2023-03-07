package com.codegym;
import java.awt.*;
import java.util.Scanner;
public class QuadraticEquation {
    private double a,b,c,delta;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return delta = Math.pow(b,2) - 4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(delta))/(2*c);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(delta))/(2*c);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("delta: "+delta);
        if(delta>=0){
            System.out.println("The equation has two root "+ quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        }else if(delta == 0){
            System.out.println("The equation has one root "+ quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }

    }
}
