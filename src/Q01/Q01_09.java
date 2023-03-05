package Q01;

import java.util.Scanner;

public class Q01_09 {

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
        Q01_09 q01_09 = new Q01_09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q01_09.solution(str));
    }
}
