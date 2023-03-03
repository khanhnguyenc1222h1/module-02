package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        do{
            System.out.print("Enter a number in index: ");
            index = scanner.nextInt();
            if(index>30){
                System.out.println("Size should not exceed 30");
            }
        }while(index>30);

        int[] arr = new int[index];
        int count = 0;
        while(count<arr.length){
            System.out.print("Enter point a student "+(count+1)+" : ");
            int point = scanner.nextInt();
            if(point<=10&&point>=0){
                arr[count] = point;
                count++;
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=5&&arr[i]<=10){
                count += 1;
            }
        }
        System.out.println("Students pass the exam: " + count);
    }
}
