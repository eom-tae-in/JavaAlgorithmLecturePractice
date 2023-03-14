package DfsAndBfs;

import java.util.Scanner;

public class Q06_A01 {
    static int n, m;
    static int[] ch, current, arr;
    public void solution(int L) {
        if (L == m) {
            for (int i : current) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    current[L] = arr[i];
                    solution(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q06_A01 q06_A01 = new Q06_A01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        current = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        q06_A01.solution(0);
    }
}