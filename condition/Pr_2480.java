package baekjoon.condition;

import java.util.Scanner;

public class Pr_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marble1, marble2, marble3;
        int prize = 0;

        marble1 = scanner.nextInt();
        marble2 = scanner.nextInt();
        marble3 = scanner.nextInt();

        if((marble1 == marble2) && (marble2 == marble3)){
            prize = 10000 + (marble1 * 1000);
        }
        else if(((marble1 == marble2) && (marble1 != marble3)) || ((marble2 == marble3) && (marble2 != marble1)) || ((marble1 == marble3) && (marble1 != marble2))){
            if(marble1 == marble2){
                prize = 1000 + (marble1 * 100);
            }
            else if(marble2 == marble3){
                prize = 1000 + (marble2 * 100);
            }
            else if(marble1 == marble3){
                prize = 1000 + (marble1 * 100);
            }
        }
        else{
            int[] arr = {marble1, marble2, marble3};
            int big = arr[0];
            for (int j : arr) {
                if (big < j) {
                    big = j;
                }
            }
            prize = big * 100;
        }
        System.out.println(prize);

    }
}
