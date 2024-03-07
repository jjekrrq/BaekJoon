package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int testCase = Integer.parseInt(stringTokenizer.nextToken());
        int standard = Integer.parseInt(stringTokenizer.nextToken());
        int[] numList = new int[testCase];

        try {
            String string = bufferedReader.readLine();
            StringTokenizer st = new StringTokenizer(string);
            for(int i = 0; i < numList.length; i++){
                numList[i] = Integer.parseInt(st.nextToken());
                if(numList[i] < standard){
                    System.out.print(numList[i] + " ");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("배열의 크기를 넘었습니다");
            return;
        }
    }
}
