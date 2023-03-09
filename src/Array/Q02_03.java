package Q02;

import java.util.Scanner;

public class Q02_03 {
    // 1: 가위, 2:바위, 3: 보
    final static int SCISSORS = 1;
    final static int ROCK = 2;
    final static int PAPER = 3;
    public char solution(int a, int b) {
        if (a == b) {
            return 'D';
        }
        if (isAWinCase(a,b)) {
            return 'A';
        }
        return 'B';
    }

    public static void main(String[] args) {
        Q02_03 q02_03 = new Q02_03();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] A = new int[number];
        int[] B = new int[number];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < number; i++) {
            System.out.println(q02_03.solution(A[i], B[i]));
        }
    }

    public static boolean isAWinCase(int a, int b) {
        return (a == SCISSORS && b == PAPER) || (a == ROCK && b == SCISSORS) || (a == PAPER && b == ROCK);
    }
}
