package baekjoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        String beforeTestCase = bufferedReader.readLine();
        int testCase = Integer.parseInt(beforeTestCase);
        int[] num = new int[testCase];
        String[] strings = new String[testCase];
        String[] strings1 = new String[testCase];

        for(int i = 0; i < testCase; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            num[i] = Integer.parseInt(stringTokenizer.nextToken());
            strings[i] = stringTokenizer.nextToken();
        }

        for (int i = 0; i < testCase; i++){
            String s;
            for(int j = 0; j < strings[i].toCharArray().length; j++){
                s =
            }
        }
    }
}
