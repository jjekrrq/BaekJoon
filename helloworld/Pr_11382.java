package baekjoon.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numList = scanner.nextLine();
        int sum = 0;

        String[] arr = numList.split(" ");
        for(int i = 0; i < arr.length; i++){
            //NumberFormatException 발생할 수 있음.
            //문자 배열에 숫자가 아닌 문자를 넣으면 예외가 발생함.
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}

// 아래는 예외 처리 완료한 리팩토링 버전

//import java.util.Scanner;
//
//public class Pr_11382 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter integers separated by spaces: ");
//        String numList = scanner.nextLine();
//
//        int sum = calculateSum(numList);
//
//        System.out.println("Sum: " + sum);
//    }
//
//    private static int calculateSum(String numList) {
//        int sum = 0;
//
//        String[] arr = numList.split(" ");
//
//        for (String num : arr) {
//            try {
//                sum += Integer.parseInt(num);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input: " + num + " is not a valid integer.");
//                // 예외 처리 후 다음 숫자로 계속 진행하거나 프로그램 종료 등을 선택할 수 있습니다.
//            }
//        }
//
//        return sum;
//    }
//}
