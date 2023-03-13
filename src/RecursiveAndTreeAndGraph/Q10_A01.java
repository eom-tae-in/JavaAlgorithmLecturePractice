package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Q10_A01 {
    static int n, e, answer = 0;
    static int[] ch;
    static int[][] graph;
    public void solution(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    solution(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q10_A01 q10_A01 = new Q10_A01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();
        ch = new int[n + 1];
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        q10_A01.solution(1);
        System.out.println(answer);
    }
}