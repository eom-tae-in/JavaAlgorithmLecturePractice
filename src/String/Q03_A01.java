package String;

import java.util.Scanner;

public class Q03_A01 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] strings = str.split(" ");
        for (String x : strings) {
            if (x.length() > m) {
                m = x.length();
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args)  {
        Q03_A01 q03_A01 = new Q03_A01();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(q03_A01.solution(str));
    }
}
