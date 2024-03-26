package baekjoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char inputStr = bufferedReader.readLine().charAt(0);

        if(inputStr >= '0' && inputStr <= '9'){
            System.out.println((int)inputStr);
        }
        if(inputStr >= 'a' && inputStr <= 'z'){
            System.out.println((int)inputStr);
        }
        if(inputStr >= 'A' && inputStr <= 'Z'){
            System.out.println((int) inputStr);
        }
    }
}
