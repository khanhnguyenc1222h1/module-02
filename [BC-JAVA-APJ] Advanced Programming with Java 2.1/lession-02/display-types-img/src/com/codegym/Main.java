package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int count = 0 ;
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
                    System.out.println();
                    for(int i=0; i<5; i++){
                        System.out.println();
                        for(int j=5; j>i; j--){
                            System.out.print("* ");
                        }
                    }
                    for(int i=0; i<=5; i++) {
                        for (int j = 0; j < 5-i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for(int i=0; i<5; i++){
                        for(int j=0; j<i;j++){
                            System.out.print("  ");
                        }
                        for(int k=0; k<5-i; k++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                break;
                case 3:
                    for(int i=0; i<=12; i++) {//có thể thay đổi chiều ngang của sao cho i<=10
                        for (int j = 0; j < 12-i; j++) {//có thể thay đổi chiều cao của sao cho j<10-i
                            System.out.print("  ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print(" *");
                        }if(i>0){
                                for(int k=0; k<i-1; k++){
                                    System.out.print(" *");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4: System.exit(4);
                break;
            }
        }
    }
}
