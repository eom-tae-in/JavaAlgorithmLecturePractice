package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class Q05_A01 {

    public int solution(int num) {
        int answer = 0, sum = 0, lt = 0;
        int[] array = new int[num/2 + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int rt = 0; rt < array.length; rt++) {
            sum += array[rt];
            if (sum == num) {
                answer++;
            }
            while (sum >= num) {
                sum -= array[lt++];
                if (sum == num) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q05_A01 q05_A01 = new Q05_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(q05_A01.solution(num));
    }
}
