package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String n = scanner.nextLine();
        for(int i=0; i<students.length; i++){
            if(students[i].equals(n)){
                check = true;
                break;
            }
        }
        if(check==true){
            System.out.println("yes "+n);
        }else{
            System.out.println("no "+n);
        }
    }
}
