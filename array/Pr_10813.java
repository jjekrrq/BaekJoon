package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int theNumberOfBasket = Integer.parseInt(stringTokenizer.nextToken());
        int howManyExchange = Integer.parseInt(stringTokenizer.nextToken());
        int[] numList = new int[theNumberOfBasket];

        for(int i = 0; i < numList.length; i++){
            numList[i] = i + 1;
        }
        for(int i = 0; i < howManyExchange; i++){
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int forExchange = 0;
            int changeValue1 = Integer.parseInt(st.nextToken());
            int changeValue2 = Integer.parseInt(st.nextToken());
            forExchange = numList[changeValue1 - 1];
            numList[changeValue1 - 1] = numList[changeValue2 - 1];
            numList[changeValue2 - 1] = forExchange;
        }
        for(int j : numList){
            System.out.print(j + " ");
        }
    }
}
