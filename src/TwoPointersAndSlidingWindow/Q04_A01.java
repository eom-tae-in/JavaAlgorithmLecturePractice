package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class Q04_A01 {

    public int solution(int[] array, int value) {
        int answer = 0;
        int sum = 0, lt = 0;
        for (int rt = 0; rt < array.length; rt++) {
            sum += array[rt];
            if (sum == value) {
                answer++;
            }
            while (sum >= value) {
                sum -= array[lt++];
                if (sum == value) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q04_A01 q04_A01 = new Q04_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int value = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(q04_A01.solution(array,value));
    }
}