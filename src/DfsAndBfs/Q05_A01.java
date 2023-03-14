package DfsAndBfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q05_A01 {
    static Integer[] array;
    static int price, answer = Integer.MAX_VALUE;
    public void solution(int L, int sum) {
        if (sum > price) {
            return;
        }
        if (L > answer) {
            return;
        }
        if (sum == price) {
            answer = Math.min(answer, L);
        } else {
            for (int j : array) {
                solution(L + 1, sum + j);
            }
        }
    }

    public static void main(String[] args) {
        Q05_A01 q05_A01 = new Q05_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        array = new Integer[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        price = sc.nextInt();
        Arrays.sort(array, Collections.reverseOrder());
        q05_A01.solution(0, 0);
        System.out.println(answer);
    }
}