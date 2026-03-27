package baekjoon.eoullim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Pr_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        int[] T = new int[N];
        int[] P = new int[N];
        int[] D = new int[N+1];

        for(int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            T[i] = Integer.parseInt(stringTokenizer.nextToken());
            P[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = N-1; i >= 0; i--) {
            if (i + T[i] > N) {
                D[i] = D[i+1];
            }
            else {
                D[i] = Math.max(D[i+1], D[i + T[i]]+P[i]);
            }
        }
        System.out.println(D[0]);
    }
}
