package DfsAndBfs;

import java.util.Scanner;

public class Q01_A01 {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;
    public void solution(int L, int sum, int[] array) {
        if (flag) {
            return;
        }
        if (sum > total / 2) {
            return;
        }
        if (L == n) {
            if (sum == total - sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            solution(L + 1, sum + array[L], array);
            solution(L + 1, sum, array);
        }
    }

    public static void main(String[] args) {
        Q01_A01 q01_A01 = new Q01_A01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            total += array[i];
        }
        q01_A01.solution(0, 0, array);
        System.out.println(answer);
    }
}