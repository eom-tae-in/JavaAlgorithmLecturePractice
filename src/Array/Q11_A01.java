package Array;

import java.util.Scanner;

public class Q11_A01 {

    public int solution(int[][] arrays, int number) {
        int answer = 0;
        int max = 0;
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j <= number; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arrays[i][k] == arrays[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[]args) {
        Q11_A01 q11_A01 = new Q11_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] arrays = new int[number + 1][6];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= 5; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }
        System.out.println(q11_A01.solution(arrays, number));
    }
}
