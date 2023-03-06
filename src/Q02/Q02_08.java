package Q02;

import java.util.Scanner;

public class Q02_08 {

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
        Q02_08 q02_08 = new Q02_08();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q02_08.solution(array)) {
            System.out.print(i + " ");
        }
    }
}
