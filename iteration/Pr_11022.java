package baekjoon.iteration;

import java.io.*;

public class Pr_11022 {
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
            System.out.printf("Case #%d: %d + %d = %d\n",(i+1),a,b,sum );
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
