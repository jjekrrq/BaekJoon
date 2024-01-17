package baekjoon.iteration;

import java.util.Scanner;

public class Pr_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kinds, theNumberOfThing;
        long total, thing, sum = 0L;

        total = scanner.nextInt();
        kinds = scanner.nextInt();

        for(int i = 0; i < kinds; i++){
            thing = scanner.nextInt();
            theNumberOfThing = scanner.nextInt();

            sum += (thing * theNumberOfThing);
        }

        if(sum == total){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
