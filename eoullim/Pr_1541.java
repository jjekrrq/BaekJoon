package baekjoon.eoullim;

import java.util.Scanner;

public class Pr_1541 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] formula = scanner.next().split("-");
        int[] numbers = new int[formula.length];

        for (int i = 0; i < formula.length; i++) {
            int smallSum = 0;

            if(formula[i].contains("+")) {
                String[] n = formula[i].split("\\+");

                for(int j = 0; j < n.length; j++) {
                    smallSum += Integer.parseInt(n[j]);
                }
                numbers[i] = smallSum;
            }

            if(!formula[i].contains("+")) {
                numbers[i] = Integer.parseInt(formula[i]);
            }
        }

        int bigSum = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            bigSum -= numbers[i];
        }
        System.out.println(bigSum);
    }
}
