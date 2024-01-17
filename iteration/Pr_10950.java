package baekjoon.iteration;

import java.util.Scanner;

public class Pr_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int runTime, a, b, sum;
        runTime = scanner.nextInt();
        sum = 0;

        for(int i = 0; i < runTime; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum = a + b;
            System.out.println(sum);
        }
    }
}
