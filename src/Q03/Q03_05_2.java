package Q03;

import java.util.Scanner;

public class Q03_05_2 {

    public int solution(int num) {
        int answer = 0, cnt = 1;
        num = num - cnt;
        while (num > 0) {
            cnt++;
            num = num - cnt;
            if (num % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Q03_05_2 q03_05 = new Q03_05_2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(q03_05.solution(num));
    }
}
