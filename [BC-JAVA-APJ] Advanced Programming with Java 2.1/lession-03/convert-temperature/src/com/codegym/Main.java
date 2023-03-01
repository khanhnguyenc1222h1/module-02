package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double f = 0;
        double c = 0;
        do {
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    f = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + Fahrenheit(f) + " C");
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    c = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + Celsius(c) + " F");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
        public static double Fahrenheit(double f){
        double celsius = (5.0 / 9) * (f - 32);
        return celsius;
        }
        public static double Celsius(double c){
            double fahrenheit = (9.0 / 5) * c + 32;
            return fahrenheit;
    }
}
