package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        //tạo không gian cho mảng
        do{
            System.out.print("Enter a size: ");
            size  = scanner.nextInt();
            if(size>20)
                System.out.println("size does not exceed 20");
        }while(size>20);
        array = new int[size];
        int i=0;
        //nhập vào giá trị đã cho trước trong mảng
        while(i<array.length){
            System.out.println("Enter element "+(i+1)+": ");
            array[i]  = scanner.nextInt();
            i++;
        }
        //xuất giá trị vừa nhập vào
        System.out.printf("%-20s%s","Elememts in array: ","");
        for(int j=0; j<array.length; j++){
            System.out.printf(array[j]+"\t");
        }
        //đảo ngược phần tử trong mảng
        for(int j=0; j<array.length/2; j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        //xuất giá trị ra sau khi đổi
        System.out.printf("\n%-20s%s","Reverse array: ","");
        for(int j=0; j<array.length; j++){
            System.out.printf(array[j] + "\t");
        }
    }
}
