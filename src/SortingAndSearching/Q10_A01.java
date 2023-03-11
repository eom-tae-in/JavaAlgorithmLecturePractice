package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_A01 {

    public int count(int[] array, int len) {
        int count = 1;
        int pos = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] - pos >= len) {
                count++;
                pos = array[i];
            }
        }
        return count;
    }

    public int solution(int[] array, int horse) {
        int answer = 0;
        Arrays.sort(array);
        int lt = 1;
        int rt = array[array.length - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(array, mid) >= horse) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q10_A01 q10_A01 = new Q10_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int horse = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(q10_A01.solution(array, horse));
    }
}
