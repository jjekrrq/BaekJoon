package baekjoon.str;

import java.util.Scanner;

public class Pr_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim(); // 🔹앞뒤 공백 제거

        if (string.isEmpty()) { // 🔹공백만 입력된 경우
            System.out.println(0);
        } else {
            String[] strings = string.split("\\s+"); // 🔹공백이 여러 개여도 하나로 취급
            System.out.println(strings.length);
        }
    }
}
