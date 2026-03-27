package baekjoon.eoullim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] limitNumber = new int[n];

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            limitNumber[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bufferedReader.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long manager = 0;

        for (int i = 0; i < n; i++) {
            manager++;

            int remain = limitNumber[i] - b;

            if (remain > 0) {
                manager += (remain + c - 1) / c;
            }
        }

        System.out.println(manager);
    }
}