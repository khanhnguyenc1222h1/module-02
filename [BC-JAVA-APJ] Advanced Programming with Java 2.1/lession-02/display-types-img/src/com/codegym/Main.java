package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while(n != 4){
            System.out.println();
            System.out.println();
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle ");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.print("Enter a number to 1 from 4: ");
            n = scanner.nextInt();
            switch(n){
                case 1 :for(int i = 0; i < 3 ; i++){
                    System.out.println();
                for(int j = 0 ; j < 7 ;j++){
                    System.out.print("* ");
                }
                }
                break;
                case 2: for(int i=1; i<=5; i++){
                    System.out.println();
                    for(int j=0; j<i; j++){
                        System.out.print("* ");
                    }
                }
                break;
                case 3: for(int i=0; i<5; i++){
                    System.out.println();
                    for(int j=5; j>i; j--){
                        System.out.print("* ");
                    }
                }
                break;
                case 4: System.exit(4);
                break;
            }
        }
    }
}
