package baekjoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        int[] spell = new int[36];

        for(int i = 0; i < inputString.length(); i++){
            char a = inputString.charAt(i);
            for(int j = 'a'; j <= 'z'; j++){
                if(a == j){
                    spell[j-97] = 1;
                    break;
                }
            }
        }
        for(int i = 0; i < spell.length; i++){
            if(spell[i] == 1){
                System.out.print(i + " ");
            }
            else{
                System.out.print(-1 + " ");
            }
        }
    }
}
