package Array;

import java.util.Scanner;

public class Q08_A01 {

    public int[] solution(int[] array) {
        int[] answer = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            answer[i] = 1;
            for (int j : array) {
                if (array[i] < j) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q08_A01 q08_A01 = new Q08_A01();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q08_A01.solution(array)) {
            System.out.print(i + " ");
        }
    }
}
