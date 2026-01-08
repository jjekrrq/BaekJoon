package baekjoon.hard1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        String input = bufferedReader.readLine();
        byte[] inputs = input.getBytes();

        for(int i = 0; i < inputs.length; i++) {
            if(inputs[i] >= 'a' && inputs[i] <= 'z') {
                alpha[inputs[i] - 'a']++;
            }

            if(inputs[i] >= 'A' && inputs[i] <= 'Z') {
                alpha[inputs[i] - 'A']++;
            }
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                result = (char) (i + 'A');
            } else if (alpha[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
