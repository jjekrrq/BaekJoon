package baekjoon.hard1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[][] strings = new String[20][3];
        double sum = 0;
        double majorSum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0; j < 3; j++) {
                strings[i][j] = stringTokenizer.nextToken();
            }
        }

        for(int i = 0; i < 20; i++){
            switch (strings[i][2]) {
                case "A+" -> strings[i][2] = "4.5";
                case "A0" -> strings[i][2] = "4.0";
                case "B+" -> strings[i][2] = "3.5";
                case "B0" -> strings[i][2] = "3.0";
                case "C+" -> strings[i][2] = "2.5";
                case "C0" -> strings[i][2] = "2.0";
                case "D+" -> strings[i][2] = "1.5";
                case "D0" -> strings[i][2] = "1.0";
                case "F" -> strings[i][2] = "0.0";
            }
        }

        for(int i = 0; i < 20; i++){
            if(strings[i][2].equals("P")){
                continue;
            }
            majorSum += (Double.parseDouble(strings[i][1]) * Double.parseDouble(strings[i][2]));
            sum += Double.parseDouble(strings[i][1]);
        }
        System.out.println(majorSum/sum);
    }
}
