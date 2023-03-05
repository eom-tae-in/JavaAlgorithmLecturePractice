package Q01;

import java.util.Scanner;

public class Q01_12 {

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
        Q01_12 q01_12 = new Q01_12();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str = sc.next();
        System.out.println(q01_12.solution(str, number));
    }
}
