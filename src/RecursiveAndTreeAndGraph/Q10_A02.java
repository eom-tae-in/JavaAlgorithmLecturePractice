package RecursiveAndTreeAndGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10_A02 {
    static int n, e, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void solution(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i : graph.get(v)) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    solution(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q10_A02 q10_A02 = new Q10_A02();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();
        ch = new int[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        q10_A02.solution(1);
        System.out.println(answer);
    }
}
