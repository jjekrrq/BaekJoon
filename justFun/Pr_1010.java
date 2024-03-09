package baekjoon.justFun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        String howManyTime = bufferedReader.readLine();
        int howManyTimes = Integer.parseInt(howManyTime);
        long[] numList = new long[howManyTimes];

        for(int i = 0; i < howManyTimes; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            long west = Long.parseLong(stringTokenizer.nextToken());
            long east = Long.parseLong(stringTokenizer.nextToken());
            long aboveMul = 1;
            long underMul = 1;
            for(long k = west; k >= 1; k--){
                underMul *= k;
            }
            for(long j = east; j >east - west; j--){
                aboveMul *= j;
            }
            if(east == west){
                numList[i] = 1;
                continue;
            }
            double combination = (double) aboveMul / underMul;
            numList[i] = (long)combination;
        }
        for(long i : numList){
            System.out.println(i);
        }
    }
}
