package baekjoon.helloworld;

import java.util.Scanner;

public class Pr_1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double div = (double)a / (double)b;
        System.out.println(div);
//        System.out.printf("%.3f", div);  이렇게 하면 소수점 3자리까지 출력
    }
}
