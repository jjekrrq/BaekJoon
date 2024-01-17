package baekjoon.iteration;

import java.io.*;

public class Pr_15552 {
    public static void main(String[] args) throws IOException { // 예외 처리
        // Scanner클래스 대신 BufferedReader클래스를 사용함.
        // BufferedReader가 Scanner보다 버퍼 사이즈가 더 크다. 즉, 더 많은 양의 데이터를 버퍼에 저장 가능함.
        // BufferedReader는 반환값이 String(고정, 디폴트값)임으로 형변환 과정을 거쳐야 함.
        // BufferedReader를 사용하기 위해선 예외 처리가 필수이다. try-catch문을 사용하던가 throws를 사용해야 한다.
        // Scanner는 공란과 줄바꿈을 기준으로 데이터 저장. BufferedReader는 줄바꿈을 기준으로 함.
        // BufferedReader의 장점: 1. 문자를 묶어서 한 번에 전달함으로 전송시간이 적게 걸려 성능이 향상됨.
        //                       2. 사용자가 문자를 잘못 입력했을 때, 수정 가능.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bufferedReader.readLine(); // 반환값이 문자열이기 때문에 자료형을 String으로 함.
        // BufferedReader로부터 받아온 데이터를 변환하는 과정
        long numberOfTimes = Long.parseLong(s);
        int a, b;

        for(int i = 0; i < numberOfTimes; i++){
            String[] input = bufferedReader.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            int sum = a + b;

            bufferedWriter.write(Integer.toString(sum));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
