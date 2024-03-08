package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int theNumberOfBasket = Integer.parseInt(stringTokenizer.nextToken());
        int times = Integer.parseInt(stringTokenizer.nextToken());
        int[] basket = new int[theNumberOfBasket];

        for(int i = 0; i < times; i++){
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int firstBasket = Integer.parseInt(st.nextToken());
            int lastBasket = Integer.parseInt(st.nextToken());
            int theBallNumber = Integer.parseInt(st.nextToken());

            for(int j = firstBasket - 1; j < lastBasket; j++){
                basket[j] = theBallNumber;
            }
        }
        for(int i : basket){
            System.out.print(i + " ");
        }
    }
}
