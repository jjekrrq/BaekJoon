package baekjoon.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()); // 반복 횟수
            String S = st.nextToken();                // 문자열

            StringBuilder result = new StringBuilder();

            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                // 각 문자를 R번 반복
                for (int k = 0; k < R; k++) {
                    result.append(c);
                }
            }

            System.out.println(result);
        }
    }
}
