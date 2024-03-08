package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_2562 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numList = new int[9];

        for(int i = 0; i < numList.length; i++){
            numList[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int max = numList[0];
        int where = 0;

        for(int i = 0; i < numList.length; i++){
            if(max < numList[i]){
                max = numList[i];
                where = i;
            }
        }
        System.out.println(max);
        System.out.println(where+1);
    }
}
