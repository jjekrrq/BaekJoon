package baekjoon.hard1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] visited = new boolean[26];

            char prev = word.charAt(0);
            visited[prev - 'a'] = true;

            boolean isGroup = true;

            for (int j = 1; j < word.length(); j++) {
                char curr = word.charAt(j);

                if (curr != prev) {
                    // 이전에 등장한 문자면 그룹 단어 아님
                    if (visited[curr - 'a']) {
                        isGroup = false;
                        break;
                    }
                    visited[curr - 'a'] = true;
                }
                prev = curr;
            }

            if (isGroup) {
                count++;
            }
        }

        System.out.println(count);
    }
}
