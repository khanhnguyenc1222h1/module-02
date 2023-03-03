package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("display value in two-array array[index1][index2]");
        System.out.print("Enter a number in index1: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter a number in index2: ");
        int index2 = scanner.nextInt();
        System.out.println();
        int[][] arr = new int[index1][index2];
        int index_i = 0;
        int index_j = 0;
        for(int i=0; i<index1;i++){
            for(int j=0; j<index2; j++){
                System.out.print("Enter to array arr["+i+"]["+j+"]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for(int i=0; i<index1;i++){
            for(int j=0; j<index2; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                    index_i = i;
                    index_j = j;
                }
            }
        }
        System.out.println("The largest number in the array is: " + max + "   elemetn in two-array: arr["+index_i+"]["+index_j+"]");
    }
}
