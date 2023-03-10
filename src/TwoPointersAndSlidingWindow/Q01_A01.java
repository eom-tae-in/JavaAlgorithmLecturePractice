package TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01_A01 {

    public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
                continue;
            }
            answer.add(arr2[p2++]);
        }
        while (p1 < arr1.length) {
            answer.add(arr1[p1++]);
        }
        while (p2 < arr2.length) {
            answer.add(arr2[p2++]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q01_A01 q01_A01 = new Q01_A01();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i : q01_A01.solution(arr1, arr2)) {
            System.out.print(i + " ");
        }

    }
}
