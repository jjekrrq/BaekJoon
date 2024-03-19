package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int totalBasket = Integer.parseInt(stringTokenizer.nextToken());
        int theNumberOfRepeat = Integer.parseInt(stringTokenizer.nextToken());
        int[] basket = new int[totalBasket];

        for(int i = 0; i < basket.length; i++){
            basket[i] = i + 1;
        }
        for(int i = 0; i < theNumberOfRepeat; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int startNum = Integer.parseInt(stringTokenizer.nextToken());
            int lastNum = Integer.parseInt(stringTokenizer.nextToken());
            for(int j = startNum-1; j < lastNum; j++){
                int temp = basket[j];
                basket[j] = basket[lastNum-1];
                basket[lastNum-1] = temp;
                lastNum--;
            }
        }
        for(int i = 0; i < basket.length; i++){
            System.out.print(basket[i] + " ");
        }
    }
}
