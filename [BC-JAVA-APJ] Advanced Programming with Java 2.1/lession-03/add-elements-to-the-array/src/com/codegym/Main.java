package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        int n = 12;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find: ");
        int x = scanner.nextInt();
            if(x<-1 || x >=arr.length-1){
                System.out.println("Do not insert the element into the array.");
            }else{
                for(int i=arr.length-1; i>x; i--){
                    arr[i]=arr[i-1];
                    }
                arr[x] = n;
                for(int i=0; i<arr.length; i++){

                    System.out.print(arr[i]+" ");
                }
           }
    }
}
