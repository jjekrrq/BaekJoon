package baekjoon.iteration;

import java.io.*;

public class Pr_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bufferedReader.readLine();
        int testCase = Integer.parseInt(s);
        int a, b;

        for(int i = 0; i < testCase; i++){
            String[] A = bufferedReader.readLine().split(" ");
            a = Integer.parseInt(A[0]);
            b = Integer.parseInt(A[1]);
            int sum = a + b;
            bufferedWriter.write("Case #" + (i+1) + ": " + String.valueOf(sum));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
