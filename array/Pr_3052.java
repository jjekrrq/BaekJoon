package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numList = new int[10];
        int[] forCheck = new int[10];
        int sum = 10;

        for(int i = 0; i < numList.length; i++){
            int divide;
            String number = bufferedReader.readLine();
            int num = Integer.parseInt(number);
            divide = num % 42;
            numList[i] = divide;
            forCheck[i] = 0;
        }
        for(int i = 0; i < numList.length-1; i++){
            for(int j = i + 1; j < numList.length; j++) {
                if(numList[i] == numList[j]){
                    forCheck[i] = -1;
                }
            }
        }
        for(int i = 0; i < forCheck.length; i++){
            sum += forCheck[i];
        }
        System.out.println(sum);
    }
}
