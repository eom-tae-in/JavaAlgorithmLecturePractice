package Q01;

import java.util.Scanner;

public class Q01_07 {

    public String solution(String str) {
        str = str.toUpperCase();
        String answer = "YES";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                return "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_07 q01_07 = new Q01_07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q01_07.solution(str));
    }
}