package baekjoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String beforeTestCase = bufferedReader.readLine();
        int testCase = Integer.parseInt(beforeTestCase);
        String[] strArray = new String[testCase];

        for(int i = 0; i < strArray.length; i++){
            strArray[i] = bufferedReader.readLine();
        }
        for(int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i].charAt(0) + "" + strArray[i].charAt(strArray[i].length()-1));
        }
    }
}
