package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Enter a number anymoney to USD: ");
        int n = scanner.nextInt();
        int result = n*rate;
        System.out.println(n + " USD is " + result + " VND");
    }
}
