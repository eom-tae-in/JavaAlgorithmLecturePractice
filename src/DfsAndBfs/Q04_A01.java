package DfsAndBfs;

import java.util.Scanner;

public class Q04_A01 {
    static int num, t;
    static int[] ch;
    public void solution(int L) {
        if (L == t) {
            for (int i : ch) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= num; i++) {
                ch[L] = i;
                solution(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Q04_A01 q04_A01 = new Q04_A01();
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        t = sc.nextInt();
        ch = new int[t];
        q04_A01.solution(0);
    }
}