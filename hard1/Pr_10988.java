package baekjoon.hard1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine();
        byte[] texts = text.getBytes();
        int size = texts.length;
        int i = 0;

        while (i < size){
            if(texts[i] != texts[size-1 - i]){
                System.out.println(0);
                break;
            }
            i++;
        }
        if (i == size){
            System.out.println(1);
        }
    }
}
