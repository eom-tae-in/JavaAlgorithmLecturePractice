package String;

import java.util.Scanner;

public class Q02_A01 {

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
                continue;
            }
            answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q02_A01 q02_A01 = new Q02_A01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q02_A01.solution(str));
    }
}
