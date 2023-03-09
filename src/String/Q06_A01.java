package String;

import java.util.Scanner;

public class Q06_A01 {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Q06_A01 q06_A01 = new Q06_A01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q06_A01.solution(str));
    }
}
