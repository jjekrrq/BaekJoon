package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] stuList = new int[31]; // 배열의 인덱스 번호를 사용자에게 입력받기 때문에 30으로 하면 안됨.

        for(int i = 0; i < 28; i++){ // 반복 횟수를 배열에서 -2하기 보다 그냥 지정하는게 가독성 높아짐.
            // 인덱스 번호 입력받기
            String num = bufferedReader.readLine();
            // 문자열을 정수로 파싱.
            int stuNum = Integer.parseInt(num);
            // 입력받은 인덱스 번호에 해당하는 배열에 1 넣어줌.
            stuList[stuNum] = 1;
        }

        for(int i = 1; i <= 30; i++){
            // 1~30 까지 없는 번호 찾기 로직
            if(stuList[i] != 1){
                System.out.println(i);
            }
        }
    }
}
