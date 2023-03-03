package com.codegym;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter index1: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter index2: ");
        int index2 = scanner.nextInt();
        int[][] arr = new int[index1][index2];
        for(int i=0; i<index1; i++){
            for(int j=0; j<index2; j++){
                System.out.print("Enter arr["+i+"]["+j+"]: ");
                arr[i][j]= scanner.nextInt();
            }
        }
        for(int i=0; i<index1; i++){
            for(int j=0; j<index2; j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}
