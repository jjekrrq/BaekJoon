package baekjoon.condition;

import java.util.Scanner;

public class Pr_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int sec = scanner.nextInt();

        if((hour >= 0) && (sec > 45)){
            System.out.print(hour + " ");
            System.out.println((sec - 45));
        }
        else if((hour > 0) && (sec < 45)){
            System.out.print(hour-1 + " ");
            System.out.println((sec - 45 + 60));
        }
        else if((hour > 0) && (sec == 45)){
            System.out.print(hour + " ");
            System.out.println(0);
        }
        else if((hour == 0) && (sec < 45)){
            System.out.print((hour-1+24) + " ");
            System.out.println((sec - 45 + 60));
        }
        else if((hour == 0) && (sec == 45)){
            System.out.print(hour + " ");
            System.out.println(0);
        }
    }
}
