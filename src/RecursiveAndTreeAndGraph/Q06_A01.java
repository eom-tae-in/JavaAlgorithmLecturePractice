package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Q06_A01 {
    static int n;
    static int[] ch;
    public void solution(int number) {
        if (number == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            ch[number] = 1;
            solution(number + 1);
            ch[number] = 0;
            solution(number + 1);
        }
    }

    public static void main(String[] args) {
        Q06_A01 q06_A01 = new Q06_A01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n + 1];
        q06_A01.solution(1);
    }
}