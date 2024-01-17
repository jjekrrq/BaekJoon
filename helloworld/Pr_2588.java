package baekjoon.helloworld;

import java.util.Scanner;

public class Pr_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = b;
        while(b > 0){
            int k = b % 10;
            b /= 10;
            System.out.println(a * k);
        }
        System.out.println(a * c);
    }
}
