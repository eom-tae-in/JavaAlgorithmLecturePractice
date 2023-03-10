package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class Q05_A02 {

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
        Q05_A02 q05_A02 = new Q05_A02();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(q05_A02.solution(num));
    }
}
