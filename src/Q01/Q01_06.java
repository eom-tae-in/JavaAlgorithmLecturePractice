package Q01;

import java.util.Scanner;

public class Q01_06 {
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
        Q01_06 q01_06 = new Q01_06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q01_06.solution(str));
    }
}
