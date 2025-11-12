package baekjoon.high_level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_3003 {
    public static void main(String[] args) throws IOException {
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] inputChess = new int[6];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < inputChess.length; i++) {
            inputChess[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - inputChess[i] + " ");
        }
    }
}
