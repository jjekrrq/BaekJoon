package baekjoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer(stringTokenizer.nextToken());
        String reverse1 = stringBuffer.reverse().toString();
        StringBuffer stringBuffer1 = new StringBuffer(stringTokenizer.nextToken());
        String reverse2 = stringBuffer1.reverse().toString();

        int a = Integer.parseInt(reverse1);
        int b = Integer.parseInt(reverse2);

        int c = (a > b) ? a : b;
        System.out.println(c);

    }
}
