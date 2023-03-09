package String;

import java.util.Scanner;

public class Q07_A01 {

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
        Q07_A01 q07_A01 = new Q07_A01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q07_A01.solution(str));
    }
}