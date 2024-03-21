package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String theNumberOfRepeatBefore = bufferedReader.readLine();
        int theNumberOfRepeat = Integer.parseInt(theNumberOfRepeatBefore);
        int[] totalSubjects = new int[theNumberOfRepeat];
        double sum = 0;

        for(int i = 0; i < totalSubjects.length; i++){
            String score = bufferedReader.readLine();
            totalSubjects[i] = Integer.parseInt(score);
        }
        int biggest = totalSubjects[0];
        for(int i = 1; i < totalSubjects.length; i++){
            if(totalSubjects[i] > biggest){
                biggest = totalSubjects[i];
            }
        }
        for(int i = 0; i < totalSubjects.length; i++){
            double mid =(double) totalSubjects[i] / biggest * 100;
            sum += mid;
        }
        double average = sum / totalSubjects.length;
        System.out.println(average);
    }
}
