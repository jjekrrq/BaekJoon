package baekjoon.iteration;

import java.util.Scanner;

public class Pr_25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theRangeOfSave = scanner.nextInt();

        for(int i = 4; i <= theRangeOfSave; i += 4){
            System.out.print("long" + " ");
        }
        System.out.println("int");
    }
}
