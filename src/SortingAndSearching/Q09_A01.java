package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Q09_A01 {

    public int count(int[] array, int capacity) {
        int count = 1, sum = 0;
        for (int x : array) {
            if (sum + x > capacity) {
                count++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return count;
    }

    public int solution(int[] array, int m) {
        int answer = 0;
        int lt = Arrays.stream(array).max().getAsInt();
        int rt = Arrays.stream(array).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(array, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q09_A01 q09_A01 = new Q09_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(q09_A01.solution(array, m));
    }
}