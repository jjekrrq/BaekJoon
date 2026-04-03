package baekjoon.eoullim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[] coinList = new int[N];
        int j = coinList.length - 1;
        int coins = 0;

        for(int i = 0; i < N; i++){
            coinList[i] = Integer.parseInt(bufferedReader.readLine());
        }

        while(K > 0){
            if(coinList[j] > K){
                j--;
                continue;
            }

            coins += K / coinList[j];
            K %= coinList[j];
            j--;
        }
        System.out.println(coins);
    }
}
