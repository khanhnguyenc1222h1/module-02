package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n  = scanner.nextInt();
        int count = 0;
        int units = 0;
        int ones = 0;
        String[] from_0_to_9 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] lessThan20 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] lessThan100 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if(n >= 0 && n < 10){
            for(int i = 0; i < from_0_to_9.length; i++){
                if(n == i){
                    System.out.println(from_0_to_9[i]);
                }
            }
        }else if(n >=10 && n <20){
            for(int i = 0 ; i < lessThan20.length ; i++){
                count = i + 10;
                if(n == count){
                    System.out.println(lessThan20[i]);
                }
            }
        }else if(n >= 20 && n < 100){
                count = n / 10;
                units  = count*10;
            if(n % 10 == 0){
                count = 10;
                for(int i=0 ; i< lessThan100.length;i++){
                    count +=10;
                    if(n == count){
                        System.out.println(lessThan100[i]);
                    }
                }
            }else{

//                for(int i=1 ; i<= ones;i++){
//                    count = n - ones;
//                    if(n == count){
//                        System.out.println(lessThan100[i]);
//                    }
//                    for(int j = 0 ; j< lessThan100.length;j++){
//                        cont
//                    }
                    for(int i = 0; i< lessThan100.length;i++){
                        for(int j = 0 ; j< from_0_to_9.length;j++){
                            if(Math.floor(count) == i+1 && units == j){
                                System.out.println(lessThan100[i+1] + " " + from_0_to_9[j]);
                            }

                    }
                }
            }
        }
    }
}
