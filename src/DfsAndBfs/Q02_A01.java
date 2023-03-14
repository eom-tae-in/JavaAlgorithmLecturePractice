package DfsAndBfs;

import java.util.Scanner;

public class Q02_A01 {
    static int answer = 0;
    static int max, dogs;
    public void solution(int L, int sum, int[] array) {
        if (max < sum) {
            return;
        }
        if (L == dogs) {
            answer = Math.max(sum, answer);
        }
        else {
            solution(L + 1, sum + array[L], array);
            solution(L + 1, sum, array);
        }

    }

    public static void main(String[] args) {
        Q02_A01 q02_A01 = new Q02_A01();
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();
        dogs = sc.nextInt();
        int[] array = new int[dogs];
        for (int i = 0; i < dogs; i++) {
            array[i] = sc.nextInt();
        }
        q02_A01.solution(0, 0, array);
        System.out.println(answer);
    }
}