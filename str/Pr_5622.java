package baekjoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Pr_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        byte[] s = bufferedReader.readLine().getBytes();
        int sum = 0;

        for(int i = 0; i < s.length; i++){
            int count;
            switch (s[i]) {
                case 'A':
                case 'B':
                case 'C':
                    count = 3;
                    sum += count;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    count = 4;
                    sum += count;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    count = 5;
                    sum += count;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    count = 6;
                    sum += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    count = 7;
                    sum += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    count = 8;
                    sum += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    count = 9;
                    sum += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    count = 10;
                    sum += 10;
                    break;
            }
        }
        System.out.println(sum);
    }
}
