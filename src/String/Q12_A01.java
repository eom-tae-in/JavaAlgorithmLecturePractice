package String;

import java.util.Scanner;

public class Q12_A01 {

    public String solution(String str, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q12_A01 q12_A01 = new Q12_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str = sc.next();
        System.out.println(q12_A01.solution(str, number));
    }
}
