package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        String beforeParseTestCase = bufferedReader.readLine();
        int testCase = Integer.parseInt(beforeParseTestCase);
        int[] numList = new int[testCase];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < testCase; i++){
            numList[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int max = numList[0];
        int min = numList[0];

        for(int i = 0; i < numList.length; i++){
            if(max < numList[i]){
                max = numList[i];
            }
            if(min > numList[i]){
                min = numList[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
