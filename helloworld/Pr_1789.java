package baekjoon.helloworld;

import java.util.Scanner;

public class Pr_1789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNumber = scanner.nextLong();
        long sum = 0L;
        long i = 0L;
        while(sum <= inputNumber){
            i++;
            sum += i;
        }
        System.out.println(i-1);
    }
}
