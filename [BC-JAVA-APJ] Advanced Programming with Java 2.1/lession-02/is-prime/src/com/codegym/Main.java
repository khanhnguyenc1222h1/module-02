package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number check");
        int number = scanner.nextInt();
        boolean check = true;
        if(number < 2){
            check = false;
        }else{
            for(int i = 2; i< number; i++){
                if(number%i==0){
                    check = false;
                }
            }
        }
        if(check == true){
            System.out.println(number+" is a prime");
        }else{
            System.out.println(number+" not is a prime");
        }

    }
}
