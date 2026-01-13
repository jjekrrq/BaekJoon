package baekjoon.hard1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_25206_Submit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;       // 학점 총합 (분모)
        double majorSum = 0.0;  // 전공 점수 합 (분자)

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken();                 // 과목명 (사용 안 함)
            double credit = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken();  // 등급

            if (grade.equals("P")) {
                continue; // P 과목 완전 제외
            }

            double score = 0.0;
            switch (grade) {
                case "A+":
                    score = 4.5;
                    break;
                case "A0":
                    score = 4.0;
                    break;
                case "B+":
                    score = 3.5;
                    break;
                case "B0":
                    score = 3.0;
                    break;
                case "C+":
                    score = 2.5;
                    break;
                case "C0":
                    score = 2.0;
                    break;
                case "D+":
                    score = 1.5;
                    break;
                case "D0":
                    score = 1.0;
                    break;
                case "F":
                    score = 0.0;
                    break;
            }

            majorSum += credit * score;
            sum += credit;
        }

        System.out.println(majorSum / sum);
    }
}
