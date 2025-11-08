//package baekjoon.hard1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class Pr_25206 {
//    public static void main(String[] args) throws IOException {
//        // 전공 평점 = (학점 * 과목 평점)의 합 / 학점의 총합
//        StringTokenizer stringTokenizer;
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> arrayList = new ArrayList<>();
//        double[] grade = new double[20];
//        int num = 0;
//
//        for(int i = 0; i < 1; i++){
//            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//
//            while (stringTokenizer.hasMoreTokens()){
//                arrayList.add(stringTokenizer.nextToken());
//            }
//        }
//        for(int i = 2; i < arrayList.size(); i += 3){
//            switch (arrayList.get(i)){
//                case "A+" :
//                    grade[num] = 4.5;
//                    num++;
//                    break;
//                case "A0" :
//                    grade[num] = 4.0;
//                    num++;
//                    break;
//                case "B+" :
//                    grade[num] = 3.5;
//                    num++;
//                    break;
//                case "B0" :
//                    grade[num] = 3.0;
//                    num++;
//                    break;
//                case "C+" :
//                    grade[num] = 2.5;
//                    num++;
//                    break;
//                case "C0" :
//                    grade[num] = 2.0;
//                    num++;
//                    break;
//                case "D+" :
//                    grade[num] = 1.5;
//                    num++;
//                    break;
//                case "D0" :
//                    grade[num] = 1.0;
//                    num++;
//                    break;
//                case "F" :
//                    grade[num] = 0.0;
//                    num++;
//                    break;
//                case "P" :
//                    grade[num]
//            }
//        }
//    }
//}
