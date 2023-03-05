package Q01;

import java.util.Scanner;

public class Q01_11 {

    public String solution(String str) {
        String answer = "";
        str += " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
                continue;
            }
            answer += str.charAt(i);
            if (cnt > 1) {
                answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_11 q01_11 = new Q01_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(q01_11.solution(str));
    }
}
