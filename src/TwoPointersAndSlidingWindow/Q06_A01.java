package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class Q06_A01 {

    public int solution(int[] array, int k) {
        int answer = 0, lt = 0, count = 0;
        for (int rt = 0; rt < array.length; rt++) {
            if (array[rt] == 0) {
                count++;
            }
            while (count > k) {
                if (array[lt++] == 0) {
                    count--;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q06_A01 q06_A01 = new Q06_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(q06_A01.solution(array, k));
    }
}
