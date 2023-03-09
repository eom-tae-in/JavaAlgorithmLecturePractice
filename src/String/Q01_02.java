package Q01;

import java.util.Scanner;

public class Q01_02 {

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
        Q01_02 q01_02 = new Q01_02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q01_02.solution(str));
    }
}
