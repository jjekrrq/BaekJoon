package baekjoon.condition;

import java.util.Scanner;

public class Pr_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour, sec, usedTime, afterSec;
        hour = scanner.nextInt();
        sec = scanner.nextInt();
        usedTime = scanner.nextInt();
        afterSec = sec + usedTime;

        if(afterSec >= 60){
            int i = afterSec / 60;
            hour += i;
            sec = afterSec - (60 * i);
            if(hour >= 24){
                int j = hour / 24;
                hour = hour - (24 * j);
            }
        }
        else{
            sec = afterSec;
        }
        System.out.print(hour + " ");
        System.out.println(sec);
    }
}
