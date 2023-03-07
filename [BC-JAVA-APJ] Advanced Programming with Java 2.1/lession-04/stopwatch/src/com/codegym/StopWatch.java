package com.codegym;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StopWatch {
    private long  startTime, endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public long start(){
        return this.startTime = System.currentTimeMillis();
    }
    public long stop(){
        return this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println();
            System.out.println("1.start time");
            System.out.println("2.stop time");
            System.out.println("3.display time");
            System.out.println("4.exit out screen");
            System.out.print("Enter a number: ");
            n = scanner.nextInt();
            switch(n){
                case 1:
                    stopWatch.start();
                    System.out.println("startTime: " + stopWatch.getStartTime());
                    break;
                case 2:
                    stopWatch.stop();
                    System.out.println("stopTime: " + stopWatch.getEndTime());
                    break;
                case 3:
                    System.out.println("getElapsedTime: : " + stopWatch.getElapsedTime());
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }while(n<5);
    }
}
//  _____________________
// |      StopWatch      |
//  ---------------------
// | startTime           |
// | endTime             |
//  ---------------------
// | getStarTime()       |
// | getEndTime()        |
// | start()             |
// | stop()              |
// | getElapsedTime()    |
//  ---------------------