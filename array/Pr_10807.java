package baekjoon.array;

import java.io.*;

public class Pr_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String test = bufferedReader.readLine();
        String[] s = bufferedReader.readLine().split(" ");
        int testCase = Integer.parseInt(test);

        int sum = 0;

        int[] intArray = new int[testCase];
        for(int i = 0; i < testCase; i++) {
            intArray[i] = Integer.parseInt(s[i]);
        }
        String gotNum = bufferedReader.readLine();
        int gottenNum = Integer.parseInt(gotNum);

        for (int j : intArray) {
            if (j == gottenNum) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
