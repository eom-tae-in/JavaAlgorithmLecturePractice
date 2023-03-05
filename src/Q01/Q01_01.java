package Q01;

import java.util.Scanner;

public class Q01_01 {

    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (x == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_01 q01_01 = new Q01_01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(q01_01.solution(str, c));
    }
}
