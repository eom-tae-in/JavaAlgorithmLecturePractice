package DfsAndBfs;

import java.util.Scanner;

public class Q03_A01 {
    static int time, problems;
    static int answer = 0;
    public void solution(int L, int timeSum, int currentScore, int[] pArray, int[] tArray) {
        if (time < timeSum) {
            return;
        }
        if (L == problems) {
            answer = Math.max(answer, currentScore);
        } else {
            solution(L + 1, timeSum + tArray[L], currentScore + pArray[L], pArray, tArray);
            solution(L + 1, timeSum, currentScore, pArray, tArray);
        }
    }

    public static void main(String[] args) {
        Q03_A01 q03_A01 = new Q03_A01();
        Scanner sc = new Scanner(System.in);
        problems = sc.nextInt();
        time = sc.nextInt();
        int[] pArray = new int[problems];
        int[] tArray = new int[problems];
        for (int i = 0; i < problems; i++) {
            pArray[i] = sc.nextInt();
            tArray[i] = sc.nextInt();
        }
        q03_A01.solution(0, 0, 0, pArray, tArray);
        System.out.println(answer);
    }
}