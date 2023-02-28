package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        double totalInterest = 0;
        System.out.print("Enter investment amount: ");
        money = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        month = scanner.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();

            totalInterest = money * (interestRate/100)/12 * month;

        System.out.println("Total of interest: " + totalInterest);
    }
}
