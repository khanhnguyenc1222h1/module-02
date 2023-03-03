package com.codegym;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        int[] arr3 = new int[arr1.length+arr2.length];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<arr1.length; i++){
            System.out.print("Enter index arr1[" + i+ "]: ");
             arr1[i] = scanner.nextInt();
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++){
            System.out.print("Enter index arr2[" + i+"]: ");
            arr2[i] = scanner.nextInt();
        }
        for(int i=0; i<arr1.length; i++){
          arr3[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

//        for(int i=0; i<arr1.length; i++){
//            for(int j=0; j<arr2.length; j++){
//                for(int k=0; k<arr3.length; k++){
//                    arr3[k] = arr1[i];
//                }
//            }
//        }
    }
}
