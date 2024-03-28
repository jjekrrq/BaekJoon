package baekjoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String testCases = bufferedReader.readLine();
        int testCase = Integer.parseInt(testCases);
        String number = bufferedReader.readLine();
        int[] numList = new int[testCase];
        int sum = 0;

        for(int i = 0; i < number.length(); i++){
            int one = Character.getNumericValue(number.charAt(i));
            numList[i] = one;
        }
        for(int i : numList){
            sum += i;
        }
        System.out.println(sum);
    }
}
