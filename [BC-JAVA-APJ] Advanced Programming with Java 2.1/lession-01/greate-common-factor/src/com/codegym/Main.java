package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = Math.abs(scanner.nextInt());

        System.out.print("Enter b: ");
        int b = Math.abs(scanner.nextInt());

        if(a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }
        while(a!=b){
            if(a>b){
                a -= b;
            }else{
                b -= a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
