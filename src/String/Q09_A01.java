package String;

import java.util.Scanner;

public class Q09_A01 {

    public int solution(String str) {
        int answer = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                answer = answer * 10 + c - '0';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q09_A01 q09_A01 = new Q09_A01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q09_A01.solution(str));
    }
}
