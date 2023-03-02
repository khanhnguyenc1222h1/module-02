package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,6,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some to delete: ");
        int index_del = scanner.nextInt();
        for(int i=0; i<arr.length; i++){
            if(index_del == i){
                for(int j=index_del; j< arr.length-1; j++){
                    arr[j] = arr[j+1];
                }
            }
            System.out.print(" " + arr[i]);
        }

    }
}
