package baekjoon.iteration;

import java.io.*;

public class Pr_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, b;
        String input;

        while((input = bufferedReader.readLine()) != null){
            String[] s = input.split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            int sum = a + b;
            bufferedWriter.write(String.valueOf(sum));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
