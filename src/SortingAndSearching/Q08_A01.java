package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_A01 {

    public int solution(int[] array, int m) {
        int answer = 0, lt = 0, rt = array.length - 1;
        Arrays.sort(array);
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (array[mid] == m) {
                answer = mid + 1;
                break;
            } else if (array[mid] < m) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Q08_A01 q08_A01 = new Q08_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(q08_A01.solution(array, m));
    }
}
