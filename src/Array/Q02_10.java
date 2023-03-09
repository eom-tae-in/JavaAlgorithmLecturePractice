package Q02;

import java.util.Scanner;

public class Q02_10 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int[][] arrays, int number) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                for (int k = 0; k < 4; k++) {
                    if (arrays[i + dx[k]][j + dy[k]] >= arrays[i][j]) {
                        break;
                    }
                    if (k == 3) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q02_10 q02_10 = new Q02_10();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] arrays = new int[number + 2][number + 2];
        for (int i = 1; i <= number; i++) {
            for (int j =1; j <= number; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }
        System.out.println(q02_10.solution(arrays, number));
    }
}
