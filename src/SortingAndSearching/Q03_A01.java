package SortingAndSearching;

import java.util.Scanner;

public class Q03_A01 {

    public int[] solution(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        Q03_A01 q03_A01 = new Q03_A01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : q03_A01.solution(array)) {
            System.out.print(i + " ");
        }
    }
}
