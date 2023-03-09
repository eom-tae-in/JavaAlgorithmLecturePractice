package Array;

import java.util.Scanner;

public class Q07_A01 {

    public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        for (int i : array) {
            if (i == 1) {
                count++;
                answer += count;
                continue;
            }
            count = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Q07_A01 q07_A01 = new Q07_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(q07_A01.solution(array));
    }
}