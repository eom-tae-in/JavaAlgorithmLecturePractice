package Q02;

import java.util.Scanner;

public class Q02_09 {

    public int solution(int[][] arrays, int number) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < number; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < number; j++) {
                sum1 += arrays[j][i];
                sum2 += arrays[i][j];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < number; i++) {
            sum1 += arrays[i][i];
            sum2 += arrays[number - i - 1][i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args) {
        Q02_09 q02_09 = new Q02_09();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] arrays = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }
        System.out.println(q02_09.solution(arrays, number));
    }
}