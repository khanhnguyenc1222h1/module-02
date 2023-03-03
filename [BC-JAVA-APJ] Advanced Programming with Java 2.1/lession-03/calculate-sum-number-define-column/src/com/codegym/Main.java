package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in index1: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter in index2: ");
        int index2 = scanner.nextInt();
        int[][] arr = new int[index1][index2];
        for(int i=0; i<index1; i++){
            for(int j=0; j<index2; j++){
                System.out.print("Enter arr["+i+"]["+j+"]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter column is: ");
        int n = scanner.nextInt();
        int sumColumn = 0;
        for(int i=0; i<index1; i++){
                sumColumn += arr[i][n];
        }
        System.out.println("Sum column is: "+ sumColumn);
    }
}
