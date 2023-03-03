package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String str = "codegymcodegym";
        System.out.print("Enter a character: ");
        String charAt = scanner.nextLine();
        for(int i=0; i<str.length(); i++){
            if(String.valueOf(str.charAt(i)).equals(charAt)){
                count++;
            }
        }
        System.out.println(count);
    }
}
