package baekjoon.iteration;

import java.io.*;

public class Pr_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, b;
        while(true){
            int sum;
            String[] s = bufferedReader.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            sum = a + b;
            if((a == 0) && (b == 0)){
                break;
            }
            bufferedWriter.write(String.valueOf(sum));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
